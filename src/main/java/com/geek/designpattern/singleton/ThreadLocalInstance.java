package com.geek.designpattern.singleton;

/**
 * 线程单例
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }
    public static ThreadLocalInstance getInstance(){
        return threadLocal.get();
    }


}
