package com.fengsao.pattern.watchObserver.version2;

/**
 * @author 轩北
 * @date 2020/11/26 8:06 下午
 */
public class CarSendType2 implements RegCarObserver{
    @Override
    public void handleRegSuccess(MsgInfo msgInfo) {
        System.out.println("发点啥=======");
    }
}
