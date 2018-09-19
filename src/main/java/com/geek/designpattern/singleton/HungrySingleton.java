package com.geek.designpattern.singleton;

/**
 * 饿汉式 在类加载的时候就已经初始化了  没有延迟加载的效果
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    //可以用静态代码块
//    private final static HungrySingleton hungrySingleton;
//    static {
//        hungrySingleton = new HungrySingleton();
//    }

    private HungrySingleton(){

        if(hungrySingleton!=null){
            throw  new RuntimeException("单例构造器禁止反射！");
        }
    }
    public static HungrySingleton getInstance() {
        return hungrySingleton ;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
