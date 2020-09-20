package com.study.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class AccountDTO {

    @ApiModelProperty(value = "用户唯一标识",required = true)
    private String uniqueid;

    @ApiModelProperty(value = "用户姓名",required = true)
    private String name;

    @ApiModelProperty(value = "身份证类型",required = true)
    private Byte licensetype;

    @ApiModelProperty(value = "身份证号码",required = true)
    private String licensenumber;

    private Integer status;

    private Integer type;

    private String mobile;

    private String organizeid;

    private String email;

    private String personid;

    private Date createtime;

    private Date modifytime;

    private String orghash;

    private Integer privacy;

    private String language;

    private String esignaccountid;

    private String oauthaccountid;

    private String esignorgid;

    private String esignrealnameflowid;

    private String loginmobile;

    private String loginemail;

    private String cardno;

    private Integer isguided;
}
