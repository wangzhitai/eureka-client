package com.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author suny
 * @version 1.0
 * @date 2018年04月04日
 */
@Aspect
@Component
public class SensitiveAopAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(SensitiveAopAspect.class);

    //@Autowired
    //private PropertiesService propertiesService;

   /* @Around("@annotation(cn.tsign.service.sync.anno.SensitiveAop)")
    public Object sensitiveAop(ProceedingJoinPoint pjp) throws Throwable {
        // 拦截的实体类，就是当前正在执行的controller
        Object target = pjp.getTarget();
        Object obj = pjp.proceed();

        //esignpro-web不需要脱敏
       *//* RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        String projectKey = request.getHeader(SysConstant.HEADERPROJECTID);

        if(StringUtils.isNotBlank(projectKey) && "1000001".equals(projectKey)){
            return obj;
        }*//*
        // 判断是否开启了脱敏开关
        PropertiesBean sensitive =
                propertiesService.getPropertiesByParamKey(
                        "sensitiveDataMasking",
                       "chinese");
        if (sensitive == null
                || Boolean.FALSE.equals(sensitive.getValue())) {
            return obj;
        }
        // 拦截的方法名称。当前正在执行的方法
        String methodName = pjp.getSignature().getName();
        // 拦截的放参数类型
        Signature sig = pjp.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new BaseRuntimeException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Class[] parameterTypes = msig.getMethod().getParameterTypes();

        // 获得被拦截的方法
        Method method = null;
        try {
            method = target.getClass().getMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException e1) {
            LOGGER.error("recordSensitiveAop error {}", e1);
        } catch (SecurityException e1) {
            LOGGER.error("recordSensitiveAop error {}", e1);
        }
        SensitiveAop sealAop = method.getAnnotation(SensitiveAop.class);
        obj = replace(JSON.toJSONStringWithDateFormat(obj, "yyyy-MM-dd HH:mm:ss"), sealAop);

        return obj;
    }

    public Object replace(String str, SensitiveAop sealAop) throws IOException, SuperException {
        String[] value = sealAop.value();
        for (String name : value) {
            String reg = "\"" + name + "\":\"\\S+?\"";
            Matcher matcher = Pattern.compile(reg).matcher(str);
            while (matcher.find()) {
                String replacement = matcher.group().split("\"")[3];
                String sensitive = SensitiveUtil.sensitive(replacement);
                str = str.replace(replacement, sensitive);
            }
        }
        return JSON.parseObject(str, new TypeReference<BaseResponse>() {});
    }*/

}
