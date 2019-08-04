package com.lu.j1993.controller;

import com.lu.j1993.annotation.DoneTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/8/4.
 */
@RestController
public class IndexController {
    @GetMapping("/index")
    @DoneTime(param = "IndexController")
    public String index(){
        System.out.println("方法执行");
        return "hello lucien";
    }

    @GetMapping("/index2")
    public String index2(){
        System.out.println("方法2执行");
        return "hello lucien";
    }
}
