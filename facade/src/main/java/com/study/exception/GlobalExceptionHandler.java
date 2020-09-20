package com.study.exception;

import com.study.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ly @Description: 全局异常处理类
 * @date 2018/01/18 11:20
 */
//@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理RuntimeException异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(BaseRuntimeException.class)
    @ResponseBody
    public BaseResponse defaultBaseRunTimeExHandler(
            HttpServletRequest req, BaseRuntimeException e) {
        LOGGER.error("deal base runtime exception error: ", e);
        int errorCode = -1;
        try {
            Method getErrorCode = e.getClass().getMethod("getErrCode");
            errorCode = (int) getErrorCode.invoke(e);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e1) {
            e1.printStackTrace();
        }
        return BaseResponse.sendFailure(errorCode, e.getMessage());
    }


    /**
     * 处理BindException异常(参数校验异常)
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public BaseResponse defaultBindHandler(
            HttpServletRequest req, MethodArgumentNotValidException e) {
        LOGGER.error(
                "Url:{},Method:{} .\nController called error!Catch in ErrorHandler",
                req.getRequestURI(),
                req.getMethod(),
                e);
        return BaseResponse.sendFailure(
                416, e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public BaseResponse defaultBindHandlerSpecial(HttpServletRequest req, BindException e) {
        LOGGER.error(
                "Url:{},Method:{} .\nController called error!Catch in ErrorHandler",
                req.getRequestURI(),
                req.getMethod(),
                e);
        return BaseResponse.sendFailure(416, e.getFieldError().getField() + ", 非法入参");
    }

    @ExceptionHandler(HttpMessageConversionException.class)
    @ResponseBody
    public BaseResponse defaultJsonException(HttpServletRequest req, Exception e) {
        LOGGER.error(
                "Url:{},Method:{} .\nController called error!Catch in ErrorHandler",
                req.getRequestURI(),
                req.getMethod(),
                e);
        return BaseResponse.sendFailure(250, "请求报文非法,请检查");
    }

    /**nh
     * 处理Exception异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResponse defaultExHandler(HttpServletRequest req, Exception e) {
        LOGGER.error(
                "Url:{},Method:{} .\nController called error!Catch in ErrorHandler",
                req.getRequestURI(),
                req.getMethod(),
                e);
//        if (e instanceof LicInterException) {
//            return BaseResponse.sendFailure(-1,e.getMessage());
//        }
            return BaseResponse.sendFailure(-1, "内部服务错误!");
    }
}
