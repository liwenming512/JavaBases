package com.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssh.service.PersonService;
import com.ssh.service.TestService;

@Controller
public class MainController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(){
		return "test";
	}
	
	@RequestMapping(value="/springtest", method = RequestMethod.GET)
	public String springtest(){
		return testService.test();
	}
	
	@RequestMapping(value="/savePerson", method = RequestMethod.GET)
	@ResponseBody
	public String savePerson(){
		personService.savePerson();
		return "success!";
	}

}
