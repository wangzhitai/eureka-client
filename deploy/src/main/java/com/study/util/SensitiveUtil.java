package com.study.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SensitiveUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(SensitiveUtil.class);

    /**
     * 固定脱敏规则，保留前三后四
     * @param number
     * @return
     */
    public static String sensitive(String number){
        if(StringUtils.isBlank(number) || number.length() <= 7){
            return number;
        }

        String sensitiveInfo =
                StringUtils.left(number, 3)
                        .concat(
                                StringUtils.removeStart(
                                        StringUtils.leftPad(
                                                StringUtils.right(number, 4),
                                                StringUtils.length(number),
                                                "*"),
                                        "***"));

        return sensitiveInfo;
    }
}
