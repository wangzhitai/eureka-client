package com.study.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogMethodMsgAspect {

    @Pointcut("execution(public * cn.tsign.service.sync.service.impl.*.*(..))")
    // 拦截调用公有云服务的所有方法，都需要打印调用日志。
    public void logMethod() {}

    @Around("logMethod()")
    public Object execute(ProceedingJoinPoint pjp) throws Throwable {
        // 拦截的方法名称。当前正在执行的方法
        String methodName = pjp.getSignature().getName();
        // 拦截的方法参数
        Object[] request = pjp.getArgs();
        // 获取当前类的日志工具log
        Logger log = LoggerFactory.getLogger(pjp.getThis().getClass());
        log.info("sync method name =>{},sync request param =>{}", methodName, JSON.toJSONString(request));
        Object response = pjp.proceed();
        log.info("sync method name =>{},sync response param =>{}", methodName, JSON.toJSONString(response));
        return response;
    }
}
