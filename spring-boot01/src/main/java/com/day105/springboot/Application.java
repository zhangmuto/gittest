package com.day105.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 入口类
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//取消横幅
		/*SpringApplication application = new SpringApplication(Application.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);*/
	}
}
