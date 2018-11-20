package com.kyra.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyra.controller.demo.DemoController;
import com.kyra.dao.domain.Demo;
import com.kyra.dao.mapper.DemoMapper;

@Service
public class DemoService {
	private final Logger logger = LoggerFactory.getLogger(DemoService.class);
	
	@Autowired 
	private DemoMapper demoMapper;
	
	public List<List<String>> getList() {
		Demo demo = new Demo();
		demo.setUsername("test");
		demo.setPassword("demo");
		demoMapper.add(demo);
		
		List<List<String>> list = new ArrayList<List<String>>();
		List<String> info1 = new ArrayList<String>();
		info1.add("a1");
		info1.add("b1");
		info1.add("c1");
		info1.add("d1");
		List<String> info2 = new ArrayList<String>();
		info1.add("a2");
		info1.add("b2");
		info1.add("c2");
		info1.add("d2");
		list.add(info1);
		list.add(info2);
		return list;
	}

}
