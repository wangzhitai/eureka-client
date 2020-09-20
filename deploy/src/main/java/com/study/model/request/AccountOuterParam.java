package com.study.model.request;

import com.study.anno.EnumValue;
import com.study.anno.Special;
import com.study.enums.AccountTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AccountOuterParam {

    @ApiModelProperty(value = "外部用户的Id",required = true)
    @NotBlank(message = "外部用户ID不能为空")
    @Special(message = "含有非法字符")
    private String accountId;


    @ApiModelProperty(value = "流程类型，Common-普通签署，Cancellation-作废签署，默认是Common")
    @EnumValue(
            enumClass = AccountTypeEnum.class,
            enumMethod = "getEnvelopeFlowTypeEnum",
            message = "流程类型不正确")
    private String flowType;
}
