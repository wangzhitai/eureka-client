package com.study.enums;

public enum AccountErrorEnum implements EnumBase{
    SYSTEM_ERROR("SYSTEM_ERROR","系统错误",-1),
    EMAIL_FORMAT_ERROR ("EMAIL_FORMAT_ERROR","该外部用户不存在：%s",10000),

    ;
    private String code;
    private String message;
    private Integer errCode;

    AccountErrorEnum(String code, String message, Integer errCode) {
        this.code = code;
        this.message = message;
        this.errCode = errCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public AccountErrorEnum setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }


    @Override
    public String message() {
        return message;
    }
}
