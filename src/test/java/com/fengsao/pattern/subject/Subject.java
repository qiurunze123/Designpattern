package com.fengsao.pattern.subject;

/**
 * @author 轩北
 * @date 2020/11/25 3:26 下午
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
