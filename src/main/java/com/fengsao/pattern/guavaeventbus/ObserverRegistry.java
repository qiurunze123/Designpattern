package com.fengsao.pattern.guavaeventbus;



import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author 轩北
 * @date 2020/11/25 9:00 下午
 */
public class ObserverRegistry {

    public void register(Object observer){
        Map<Class<?> ,Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registerEventActions = register.get(eventType);
            if(registerEventActions == null){
                register.putIfAbsent(eventType,new CopyOnWriteArraySet<>());
                registerEventActions = register.get(eventType);
            }
            registerEventActions.addAll(eventActions);
        }
    }

    public void unRegister(Object observer){
        Map<Class<?> ,Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {
            Class<?> eventType = entry.getKey();
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registerEventActions = register.get(eventType);
            if (registerEventActions == null || !registerEventActions.removeAll(eventActions)) {
                // if removeAll returns true, all we really know is that at least one subscriber was
                // removed... however, barring something very strange we can assume that if at least one
                // subscriber was removed, all subscribers on listener for that event type were... after
                // all, the definition of subscribers on a particular class is totally static
                throw new IllegalArgumentException(
                        "missing event subscriber for an annotated method. Is " + "" + " registered?");
            }        }

    }


    /**
     * CopyOnWriteArraySet 内部也是使用 CopyOnWriteArrayList  并发操作
     */

    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> register =new ConcurrentHashMap<>();
    public List<ObserverAction> getMatchedObserverActions(Object event){
        List<ObserverAction> matchObservers = new ArrayList<>();
        Class<?> postedEventType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : register.entrySet()) {
            Class<?> eventType = entry.getKey();
            CopyOnWriteArraySet<ObserverAction> eventActions = entry.getValue();
            /**
             * class1.isAssignableFrom(class2) 判定此 Class 对象所表示的类或接口与指定的 Class 参数所表示的类或接口是否相同，
             * 或是否是其超类或超接口。如果是则返回 true；否则返回 false。如果该 Class 表示一个基本类型，且指定的 Class 参数正是该 Class 对象，
             * 则该方法返回 true；否则返回 false。
             *
             * 1.class2是不是class1的子类或者子接口
             *
             * 2.Object是所有类的父类
             */
            if(postedEventType.isAssignableFrom(eventType)){
                matchObservers.addAll(eventActions);
            }
        }
        return matchObservers;
    }

    /**
     * 匹配 类和整体实例方法的关系
     * @param observer
     * @return
     */
    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer){
        Map<Class<?> ,Collection<ObserverAction>> observerActions = new HashMap<>();
        Class<?> clazz = observer.getClass();
        for(Method method:getAnnotatedMethods(clazz)){
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventType = parameterTypes[0];
            if(!observerActions.containsKey(eventType)){
                observerActions.put(eventType,new ArrayList<>());
            }
            observerActions.get(eventType).add(new ObserverAction(observer,method));
        }
        return observerActions;
    }


    /**
     * 扫描 类的注解
     * @param clazz
     * @return 将标注这个注解的方法全部存储在List里面
     */
    private static List<Method> getAnnotatedMethods(Class<?> clazz){
        List<Method> annotatedMethods = new ArrayList<>();

        for(Method method : clazz.getDeclaredMethods()){
            /**
             * isAnnotationPresent return true 制定类型的注解存在此元素上
             */
            if(method.isAnnotationPresent(Subscribe.class)){
                Class<?>[] parameterTypes = method.getParameterTypes();
                checkArgument(
                        parameterTypes.length == 1,
                        "Method %s has @Subscribe annotation but has %s parameters."
                                + "Subscriber methods must have exactly 1 parameter.",
                        method,
                        parameterTypes.length);
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }

}
