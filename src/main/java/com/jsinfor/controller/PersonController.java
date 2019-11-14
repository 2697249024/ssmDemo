package com.jsinfor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.jsinfor.bean.Person;
import com.jsinfor.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("selectAll")
	@ResponseBody
	public List<Person> selectAll() {
		List<Person> list = personService.selectAll();
		return list;
	}
	
	@RequestMapping("findById")
	@ResponseBody
	public Person findById(Integer id) {
		Person person = personService.findById(id);
		return person;
	}
	
}
