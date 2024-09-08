package com.job.executor.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestExecutor {

    @XxlJob("demoExecutor")
    public void demoExecutor(){
        log.info("作业已执行！");
    }
}
