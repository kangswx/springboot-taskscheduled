package com.kangswx.springboottaskscheduled.taskscheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTest {


    private static final Logger logger = LoggerFactory.getLogger(ScheduledTest.class);

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

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
        logger.info("执行静态定时任务时间: " + sdf.format(new Date())
                +", 线程名称"+Thread.currentThread().getName());
    }

}
