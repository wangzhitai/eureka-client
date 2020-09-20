/**
 * 杭州天谷信息科技有限公司源代码，版权归杭州天谷信息科技有限公司所有 <br>
 * 项目名称：esignpro-service <br>
 * 文件名：SpecialCheck.java <br>
 * 包：cn.tsign.www.esignpro.util.check <br>
 * 描述：TODO <br>
 * 修改历史： <br>
 * 1.[2017年8月31日下午3:32:26]创建文件 by Administrator
 */
package com.study.anno;


import com.alibaba.fastjson.JSON;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * 类名：SpecialCheck.java <br>
 * 功能说明：TODO <br>
 * 修改历史： <br>
 * 1.[2017年8月31日下午3:32:26]创建类 by flh
 */
public class SpecialCheck implements ConstraintValidator<Special, String> {

    private static final long serialVersionUID = 1L;

    private String standardValue;

    @Override
    public void initialize(final Special special) {
        this.standardValue = special.value();
    }

    @Override
    public boolean isValid(String obj, ConstraintValidatorContext constraintValidatorContext) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            final String origin = (String) obj;
            if (StringUtils.isNotBlank(standardValue)) {
                List<String> validObj = JSON.parseArray(standardValue, String.class);
                if (CollectionUtils.isNotEmpty(validObj)) {
                    for (String s : validObj) {
                        if (!(-1 == origin.indexOf(s))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
