package com.kangswx.springboottaskscheduled.controller;

import com.kangswx.springboottaskscheduled.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/asynctask")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("excute")
    public void excuteAsync() throws InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = new Date();
        System.out.println("调用异步任务开始"+sdf.format(start));
        asyncService.firstTack();
        asyncService.secondTask();
        asyncService.thirdTask();
        Date end = new Date();
        System.out.println("调用异步任务结束"+sdf.format(end));

        System.out.println("执行总时间为： " + (end.getTime() - start.getTime()));
    }
}
