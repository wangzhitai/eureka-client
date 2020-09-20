package com.study.exception;


import com.study.enums.EnumBase;

public class BaseRuntimeException extends RuntimeException{
    protected String code;
    protected String msg;

    public BaseRuntimeException(EnumBase enumBase) {
        super(enumBase.message());
        this.code = enumBase.name();
        this.msg = enumBase.message();
    }

}
