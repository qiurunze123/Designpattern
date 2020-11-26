package com.fengsao.pattern.watchObserver;

/**
 * @author 轩北
 * @date 2020/11/26 7:54 下午
 * 停车controller
 */
public class CarStopController {

    private CarStopService carStopService;
    private CarStopSendService carStopSendService;

    public boolean carStop(String carNum , String phoneNum){
        /** 一些校验和异常处理全部省略 **/
      boolean isSuccess =   carStopService.isSuccessStopCar(carNum);
      if(isSuccess){
          carStopSendService.send(phoneNum);
      }
      return true;
    }

}
