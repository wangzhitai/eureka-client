package com.study.exception;

import com.study.enums.AccountErrorEnum;

import java.util.Formatter;

public class AccountException extends BaseRuntimeException{
    private int errCode = 0;
    private boolean errShow = false;
    private Object args[];
    private String formated;

    public AccountException(AccountErrorEnum model, Object ... args) {
        super(model);
        this.args=args;
        this.formated = model.message();
        this.errCode = model.getErrCode();

        if (null == args || 0 == args.length) {
            this.formated = model.message();
            this.msg = model.message();
            this.code = model.getCode();

        } else {

            try {
                Formatter formatter = new Formatter();
                this.formated = formatter.format(model.message(), args).toString();
                formatter.close();
                this.msg = this.formated;
                this.code = model.getCode();
            } catch (Throwable e) {
                e.printStackTrace();
                this.formated = model.message();
                this.msg = model.message();
                this.code = model.getCode();
            }
        }

    }
    public String getMessage() {
        return msg;
    }

    public int getErrCode() {
        return errCode;
    }

    public AccountException setErrCode(int errCode) {
        this.errCode = errCode;
        return this;
    }

}
