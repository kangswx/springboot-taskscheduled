package com.kangswx.springboottaskscheduled.mapper;

import com.kangswx.springboottaskscheduled.entity.Cron;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CronMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cron record);

    int insertSelective(Cron record);

    Cron selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cron record);

    int updateByPrimaryKey(Cron record);
}