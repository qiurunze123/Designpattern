package com.geek.designpattern.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 在初始化的时候，会把多个单例的对象放在map中，然后方便取出和放入
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }
    private static Map<String,Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key , Object instance){
        if(StringUtils.isNotBlank(key)&& instance ==null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstace(String key){
        return singletonMap.get(key);
    }
}
