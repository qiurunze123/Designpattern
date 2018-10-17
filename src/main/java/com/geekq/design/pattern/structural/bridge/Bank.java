package com.geekq.design.pattern.structural.bridge;

/**
 * Created by geekq
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
