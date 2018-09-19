package com.geek.designpattern.singleton;

/**
 * 懒汉式 -- 双重检查 兼顾性能与坑
 */
public class LazyDoubleCheckSingleton {

    private volatile  static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;//加入volatile 防止指令重排需
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton ==null ){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null ){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
