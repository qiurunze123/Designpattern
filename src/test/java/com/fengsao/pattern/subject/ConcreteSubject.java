package com.fengsao.pattern.subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 轩北
 * @date 2020/11/25 3:30 下午
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers =new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String message) {
       for(Observer observer:observers){
           observer.update(message);
        }
    }
}
