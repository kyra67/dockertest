package com.kyra.controller.demo;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyra.service.DemoService;

@Controller
//@RequestMapping(value="demo")
public class DemoController {
	private final Logger logger = LoggerFactory.getLogger(DemoController.class);
	@Autowired 
	private DemoService demoService;
	
	@RequestMapping(value="/v1", method=RequestMethod.GET)
	public String demo(Map<String, Object> map){
		List<List<String>> list = demoService.getList();
		System.out.println(demoService);
		map.put("list", list);
		return "/WEB-INF/jsp/test.jsp";
	}

}
