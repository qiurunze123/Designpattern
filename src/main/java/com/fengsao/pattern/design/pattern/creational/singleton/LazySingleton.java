package com.fengsao.pattern.design.pattern.creational.singleton;

/**
 * Created by geekq
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
        if(lazySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class objectClass = LazySingleton.class;
//        Constructor c = objectClass.getDeclaredConstructor();
//        c.setAccessible(true);
//
//        LazySingleton o1 = LazySingleton.getInstance();
//
//        Field flag = o1.getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(o1,true);
//
//
//        LazySingleton o2 = (LazySingleton) c.newInstance();
//
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1==o2);
//    }

}
