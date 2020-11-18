package com.fengsao.pattern.design.version2;

import com.fengsao.pattern.design.version1.OrderIdGenerator;
import com.fengsao.pattern.design.version1.GeneratorCommonMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 轩北
 * @date 2020/11/16 8:09 下午
 */
public class RandomIdGenerator2  extends GeneratorCommonMethod implements OrderIdGenerator {
    private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator2.class);

    @Override
    public String generate() {
        return "";
    }
}
