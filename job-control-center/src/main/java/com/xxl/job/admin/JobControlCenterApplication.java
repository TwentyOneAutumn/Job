package com.xxl.job.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@Slf4j
@SpringBootApplication
public class JobControlCenterApplication {

	public static void main(String[] args) {
        SpringApplication.run(JobControlCenterApplication.class, args);
		log.info("调度中心服务启动成功");
	}
}