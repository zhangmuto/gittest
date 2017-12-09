package com.day105.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 练习dome处理器
 */
@RequestMapping("test")
@RestController  //输出字符串
public class DomeController {
	
	
	@RequestMapping("dome")
	public String testDome() {
		return "你好，包包";
	}
	
}
