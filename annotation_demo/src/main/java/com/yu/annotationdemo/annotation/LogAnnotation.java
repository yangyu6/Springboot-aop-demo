package com.yu.annotationdemo.annotation;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.*;

/**
 * @author: yu
 * @description:
 * @create: 2020-04-03 15:27
 **/
@Inherited
@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {

    String value() default "默认备注";
}
