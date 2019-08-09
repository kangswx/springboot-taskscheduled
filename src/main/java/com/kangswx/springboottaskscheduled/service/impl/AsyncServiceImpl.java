package com.kangswx.springboottaskscheduled.service.impl;

import com.kangswx.springboottaskscheduled.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AsyncServiceImpl implements AsyncService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Async
    @Override
    public void firstTack() throws InterruptedException {
        System.out.println("第一个异步任务开始执行: " + sdf.format(new Date()) + " 线程名为： " + Thread.currentThread().getName());
        Thread.sleep(1000 * 3L);
        System.out.println("第一个异步任务执行结束: " + sdf.format(new Date()) + " 线程名为： " + Thread.currentThread().getName());
    }

    @Async
    @Override
    public void secondTask() throws InterruptedException {
        System.out.println("第二个异步任务开始执行: " + sdf.format(new Date()) + " 线程名为： " + Thread.currentThread().getName());
        Thread.sleep(1000 * 4L);
        System.out.println("第二个异步任务执行结束: " + sdf.format(new Date()) + " 线程名为： " + Thread.currentThread().getName());
    }

    @Async
    @Override
    public void thirdTask() throws InterruptedException {
        System.out.println("第三个异步任务开始执行: " + sdf.format(new Date()) + " 线程名为： " + Thread.currentThread().getName());
        Thread.sleep(1000 * 5L);
        System.out.println("第三个异步任务执行结束: " + sdf.format(new Date()) + " 线程名为： " + Thread.currentThread().getName());
    }
}
