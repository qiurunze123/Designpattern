package com.geek.designpattern.singleton;

/**
 * effectjava  书中推荐 枚举类来创建单例子模式 序列化readenum
 * 枚举类型无法进行反射攻击
 */
public enum  EnumInstance {

    INSTANCE ;

    private Object data ;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE ;
    }
}
