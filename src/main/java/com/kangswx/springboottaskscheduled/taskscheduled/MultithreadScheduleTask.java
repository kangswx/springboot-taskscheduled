package com.kangswx.springboottaskscheduled.taskscheduled;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
public class MultithreadScheduleTask {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0/2 * * * * ?")
    @Async
    public void first() throws InterruptedException {
        System.out.println("第一个定时任务执行时间： " + sdf.format(new Date()) + "线程名为： " + Thread.currentThread().getName());
        Thread.sleep(1000*10L);
    }

    @Scheduled(cron = "0/5 * * * * ?")
    @Async
    public void second() throws InterruptedException {
        System.out.println("第二个定时任务执行时间： " + sdf.format(new Date()) + "线程名为： " + Thread.currentThread().getName());
        Thread.sleep(1000*10L);
    }
}
