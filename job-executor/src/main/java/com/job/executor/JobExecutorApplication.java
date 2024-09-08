package com.job.executor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class JobExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobExecutorApplication.class, args);
        log.info("任务执行服务启动成功");
    }
}
