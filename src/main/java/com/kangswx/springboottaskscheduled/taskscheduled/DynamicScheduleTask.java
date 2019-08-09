package com.kangswx.springboottaskscheduled.taskscheduled;

import com.alibaba.druid.util.StringUtils;
import com.kangswx.springboottaskscheduled.entity.Cron;
import com.kangswx.springboottaskscheduled.mapper.CronMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
public class DynamicScheduleTask implements SchedulingConfigurer {

    @Autowired
    private CronMapper cronMapper;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        scheduledTaskRegistrar.addTriggerTask(
                //1.添加任务内容(Runnable)
                () -> System.out.println("执行动态定时任务"+ sdf.format(new Date())),
                //2.设置执行周期(Trigger)
                triggerContext -> {
                    //2.1 从数据库获取执行周期
                    Cron cron = cronMapper.selectByPrimaryKey(1);
                    String cron_str = cron.getCron();
                    //2.2 合法性校验.
                    if(StringUtils.isEmpty(cron_str)){
                        System.out.println("获取定时任务执行时间出错");
                    }
                    //2.3 返回执行周期(Date)
                    return new CronTrigger(cron_str).nextExecutionTime(triggerContext);
                }
        );
    }
}
