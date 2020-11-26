package com.fengsao.pattern.watchObserver.version2;

import com.fengsao.pattern.watchObserver.CarStopSendService;
import com.fengsao.pattern.watchObserver.CarStopService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 轩北
 * @date 2020/11/26 8:07 下午
 */
public class CarStopController {

    private CarStopService carStopService;
    private CarStopSendService carStopSendService;


    /**
     * 在哪动态的复制 都行
     */
    private List<RegCarObserver> regCarObservers = new ArrayList<>();
    public void setRegCarObservers(List<RegCarObserver> regCarObservers) {
        regCarObservers.addAll(regCarObservers);
    }

    public boolean carStop(String carNum , String phoneNum){
        /** 一些校验和异常处理全部省略 **/
        boolean isSuccess =   carStopService.isSuccessStopCar(carNum);
//        if(isSuccess){
//            carStopSendService.send(phoneNum);
//        }
        MsgInfo msgInfo = new MsgInfo();
        msgInfo.setCarNum(carNum);
        msgInfo.setPhoneNum(phoneNum);
        regCarObservers.forEach(reg->{
            reg.handleRegSuccess(msgInfo);
        });

        return true;
    }

}
