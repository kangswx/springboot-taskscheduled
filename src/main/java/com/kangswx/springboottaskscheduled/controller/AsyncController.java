package com.kangswx.springboottaskscheduled.controller;

import com.kangswx.springboottaskscheduled.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/asynctask")
public class AsyncController {

    private static final Logger logger = LoggerFactory.getLogger(AsyncController.class);

    @Autowired
    private AsyncService asyncService;

    /**
     * 调用异步任务接口
     * @throws InterruptedException
     */
    @GetMapping("excute")
    public void excuteAsync() throws InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = new Date();
        logger.info("调用异步任务开始"+sdf.format(start)
                +"， 线程名称为"+Thread.currentThread().getName());
        asyncService.firstTack();
        asyncService.secondTask();
        asyncService.thirdTask();
        Date end = new Date();
        logger.info("调用异步任务结束"+sdf.format(end));

        logger.info("执行总时间为： " + (end.getTime() - start.getTime())
                +"， 线程名称为"+Thread.currentThread().getName());
    }
}
