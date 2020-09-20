package com.study.anno;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/** @Author: BaoDongdong @Date : 16:13 2018/8/13. */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EnumValue.Validator.class})
public @interface EnumValue {
    String message() default "{custom.value.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    Class<? extends Enum<?>> enumClass();

    String enumMethod();

    public static class Validator implements ConstraintValidator<EnumValue, Object> {
        private Class<? extends Enum<?>> enumClass;
        private String enumMethod;

        public Validator() {}

        public void initialize(EnumValue enumValue) {
            this.enumMethod = enumValue.enumMethod();
            this.enumClass = enumValue.enumClass();
        }

        public boolean isValid(
                Object value, ConstraintValidatorContext constraintValidatorContext) {
            if (value == null) {
                return Boolean.TRUE.booleanValue();
            } else if (this.enumClass != null && this.enumMethod != null) {
                Class valueClass = value.getClass();

                try {
                    Method method =
                            this.enumClass.getMethod(this.enumMethod, new Class[] {valueClass});
                    if (!method.getReturnType()
                            .getSimpleName()
                            .trim()
                            .equals(this.enumClass.getSimpleName().trim())) {
                        throw new RuntimeException("ENUM_CODE_ERROR");
                    } else if (!Modifier.isStatic(method.getModifiers())) {
                        throw new RuntimeException("ENUM_CODE_ERROR");
                    } else {
                        Object result = method.invoke((Object) null, new Object[] {value});
                        return result != null;
                    }
                } catch (IllegalArgumentException
                        | InvocationTargetException
                        | IllegalAccessException var6) {
                    throw new RuntimeException("ENUM_CODE_ERROR");
                } catch (SecurityException | NoSuchMethodException var7) {
                    throw new RuntimeException("ENUM_CODE_ERROR");
                }
            } else {
                return Boolean.TRUE.booleanValue();
            }
        }
    }
}
