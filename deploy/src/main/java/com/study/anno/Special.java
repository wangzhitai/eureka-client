/**
 * 杭州天谷信息科技有限公司源代码，版权归杭州天谷信息科技有限公司所有 <br>
 * 项目名称：esignpro-service <br>
 * 文件名：SpecialCheck.java <br>
 * 包：cn.tsign.www.esignpro.util.check <br>
 * 描述：TODO <br>
 * 修改历史： <br>
 * 1.[2017年8月31日下午3:29:58]创建文件 by Administrator
 */
package com.study.anno;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static com.study.constant.Constant.NAMEREX_SPECIAL_JSON;


/**
 * 类名：SpecialCheck.java <br>
 * 功能说明：TODO <br>
 * 修改历史： <br>
 * 1.[2017年8月31日下午3:29:58]创建类 by flh
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Constraint(validatedBy = SpecialCheck.class)
public @interface Special {

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String message() default "参数非法";

    String value() default NAMEREX_SPECIAL_JSON;
}
