package com.fengsao.pattern.subject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 轩北
 * @date 2020/11/25 3:34 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo {

    @Test
    public void givenObserver_String(){
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers("测试一个坑");
    }
}
