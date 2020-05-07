package com.yu.annotationdemo.service;

import com.yu.annotationdemo.annotation.LogAnnotation;
import com.yu.annotationdemo.annotation.MyAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yu
 * @description:
 * @create: 2020-04-03 13:06
 **/
@RestController
@RequestMapping("log")
@LogAnnotation("查询用户id")
public class LogServiceImpl {


    @RequestMapping("getUserId")
    public String getUserId(String id){

        return id;
    }
}
