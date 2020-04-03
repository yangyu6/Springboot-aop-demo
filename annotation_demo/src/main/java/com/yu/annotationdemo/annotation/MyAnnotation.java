package com.yu.annotationdemo.annotation;

import java.lang.annotation.*;

/**
 * @author: yu
 * @description:
 * @create: 2020-04-03 10:48
 **/
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "默认的注释";
}
