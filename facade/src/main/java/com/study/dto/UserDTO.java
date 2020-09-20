package com.study.dto;

import com.study.anno.EnumValue;
import com.study.enums.UserTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserDTO {

    @ApiModelProperty(value = "用户姓名",required = true)
    private String name;

    @ApiModelProperty(value = "用户性别")
    @NotEmpty(message = "性别不能为空")
    private String sex;

    @ApiModelProperty(value = "用户地址")
    private String addr;

    @ApiModelProperty(value = "用户年纪")
    private Integer age;

    @ApiModelProperty(value = "用户类型")
    @EnumValue(enumClass = UserTypeEnum.class,enumMethod = "getUserTypeEnum",message = "用户类型不正确")
    @NotEmpty(message = "用户类型不能为空")
    private String userType;
}
