package com.kangswx.springboottaskscheduled.taskscheduled;

import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

//@Component
public class ScheduledTest {

    /**
     * 静态定时任务
     * 秒(0-59) 例如0/5表示每5秒
     * 分(0-59)
     * 时(0-23)
     * 日(0-31)
     * 月(0-11)
     * 周(可填1-7 或 SUN/MON/TUE/WED/THU/FRI/SAT)
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void testTask(){
        System.out.println("执行静态定时任务时间: " + LocalDateTime.now());
    }

}
