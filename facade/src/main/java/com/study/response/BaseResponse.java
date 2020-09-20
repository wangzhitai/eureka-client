package com.study.response;

import com.alibaba.fastjson.JSONObject;
import com.study.exception.BaseRuntimeException;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;

/** Created by Think on 2018/7/12. */
public class BaseResponse<T> {

    public BaseResponse() {
        this.errCode = 0;
        this.msg = "成功";
        this.errShow = true;
    }

    public BaseResponse(Throwable e) {
        if (e == null) {
            this.errCode = 0;
            this.msg = "";
            this.errShow = true;
        } else if (e instanceof BaseRuntimeException) {
            BaseRuntimeException baseRuntimeException = (BaseRuntimeException) e;
            this.errCode = -1;
            this.msg = baseRuntimeException.getMessage();
            this.errShow = true;
        }
    }

    @ApiModelProperty(value = "错误码，0-成功，其它数字均为失败")
    private int errCode;

    @ApiModelProperty(value = "错误信息")
    private String msg;

    @ApiModelProperty(value = "错误是否显示")
    private boolean errShow;

    @ApiModelProperty(value = "返回的数据内容")
    private T data;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isErrShow() {
        return errShow;
    }

    public void setErrShow(boolean errShow) {
        this.errShow = errShow;
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this).toString();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 发送成功消息（带数据）
     *
     * @param data
     * @return
     */
    public static <T> BaseResponse<T> sendSuccessData(String message, T data) {
        BaseResponse<T> result = new BaseResponse<>();
        result.setErrCode(200);
        result.setMsg(message);
        result.setData(data);
        return result;
    }

    /**
     * 发送成功消息（带数据）
     *
     * @param data
     * @return
     */
    public static <T> BaseResponse<T> sendSuccessData(T data) {
        BaseResponse<T> result = new BaseResponse<>();
        result.setErrCode(200);
        result.setMsg("");
        result.setData(data);
        return result;
    }

    /**
     * 发送错误消息
     *
     * @param code
     * @param error
     * @return
     */
    public static <T> BaseResponse<T> sendFailure(int code, String error) {
        BaseResponse<T> result = new BaseResponse<>();
        result.setErrCode(code);
        result.setMsg(error);
        result.setData(null);
        return result;
    }

    public BaseResponse setDate(String key, T data) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(key, data);
        this.data = (T) map;
        return this;
    }
}
