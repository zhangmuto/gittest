package com.day105.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * freemarker动态资源访问练习
 */
@RequestMapping("/fm")
@Controller
public class FreemController {
	
	@RequestMapping("query/{userName}")
	public String freeTest1(@PathVariable String userName,Map<String,String > map) {
		//将用户的数据设置到模板中
		map.put("userName", userName);
		//返回视图
		return "freemlist";
	}
	
	@RequestMapping("queryById/{userId}")
	public ModelAndView freeTest2(@PathVariable Integer userId) {
		ModelAndView mv = new ModelAndView("freemlist");  //设置返回的视图
		mv.addObject("userId", userId);
		mv.addObject("userName", "999111999");
		return mv;
	}
}
