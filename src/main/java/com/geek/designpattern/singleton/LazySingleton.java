package com.geek.designpattern.singleton;

/**
 * 线程不安全 多线程模拟 懒汉式解决方式 加锁 synchronized 但是锁住的使整个方法性能开销比较大 
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null ;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton ==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton ;
    }
}
