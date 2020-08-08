package com.codermy.myspringsecurityplus.log.service;

import com.codermy.myspringsecurityplus.entity.MyRole;
import com.codermy.myspringsecurityplus.log.dto.LogDto;
import com.codermy.myspringsecurityplus.log.dto.LogQuery;
import com.codermy.myspringsecurityplus.log.entity.MyLog;
import com.codermy.myspringsecurityplus.utils.Result;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * @author codermy
 * @createTime 2020/8/4
 */
public interface MyLogService {

    /**
     * 分页模糊查询用户日志
     * @param startPosition 起始页
     * @param limit 每页多少条数据
     * @param logQuery //查询条件
     * @return
     */
    Result<LogDto> getFuzzyInfoLogByPage(Integer startPosition, Integer limit, LogQuery logQuery);


    void save(String userName, String browser, String ip, ProceedingJoinPoint joinPoint, MyLog log);
    /**
     * 删除所有错误日志
     */
    void delAllByError();

    /**
     * 删除所有INFO日志
     */
    void delAllByInfo();
}