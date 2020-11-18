package com.fengsao.pattern.design.version1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 轩北
 * @date 2020/11/18 4:51 下午
 */
public abstract class GeneratorCommonMethod {

    private String getLastfieldOfHostName() {
        String substrOfHostName = null;
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            substrOfHostName = "";
        } catch (UnknownHostException e) {
        }
        return substrOfHostName;
    }

}
