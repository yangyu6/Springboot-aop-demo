package com.yu.annotationdemo.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Timer;

/**
 * @author: yu
 * @description:
 * @create: 2020-04-03 14:23
 **/
@Aspect
@Component
public class LogAspect {


    // 切入点
    @Pointcut("@annotation(com.yu.annotationdemo.annotation.LogAnnotation)")
    public void logAnnotationPointcut() {
    }


    @Around("logAnnotationPointcut()")
    public Object myAnnotationAround(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取目标类名
        String targetName = joinPoint.getTarget().getClass().getName();
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //获取相关参数
        Object[] arguments = joinPoint.getArgs();
        //生成类对象
        Class targetClass = Class.forName(targetName);
        //获取该类中的方法
        Method method = targetClass.getMethod(methodName, String.class);

        Object proceed = joinPoint.proceed();

        System.out.println("方法结束后");

        LogAnnotation logAnnotation = method.getAnnotation(LogAnnotation.class);

        if (logAnnotation != null) {
            String logAnnotationValue = logAnnotation.value();
            // todo 将需要的日志信息 插入db中
        }
        return proceed;
    }
}
