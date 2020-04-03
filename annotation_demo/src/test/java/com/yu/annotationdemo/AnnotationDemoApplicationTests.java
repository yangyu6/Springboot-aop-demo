package com.yu.annotationdemo;

import com.yu.annotationdemo.annotation.MyAnnotation;
import com.yu.annotationdemo.service.LogServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;

@SpringBootTest
@Slf4j
class AnnotationDemoApplicationTests {

    @Test
    void test() throws Exception {
        //Class<?> LogServiceImplClass = LogServiceImpl.class;
        Class<?> LogServiceImplClass = Class.forName("com.yu.annotationdemo.service.LogServiceImpl");
        Method getLogMethod = LogServiceImplClass.getMethod("getUserLog");
        MyAnnotation annotation = getLogMethod.getAnnotation(MyAnnotation.class);
        if (annotation != null) {
            log.error("方法的注释为：："+annotation.value());
        }
    }

    @Test
    void test2() throws Exception {
        LogServiceImpl logService = new LogServiceImpl();
        logService.getUserId("11");

    }

}
