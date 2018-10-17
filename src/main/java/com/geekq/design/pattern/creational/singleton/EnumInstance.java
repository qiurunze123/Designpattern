package com.geekq.design.pattern.creational.singleton;

/**
 * Created by geekq
 */
public enum EnumInstance {
    INSTANCE{
        protected  void printTest(){
            System.out.println("Geekq Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
