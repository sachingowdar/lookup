package com.sachin.lookup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.lookup.service.ILookupService;
import com.sachin.lookup.service.LookupService;

@RestController
@RequestMapping("/")
public class MainController {
	
	@Autowired
	public ILookupService service;
	
	@GetMapping(value = "hello")
	public String  hello() {
		
		return service.getAck();
	}
	
	@GetMapping(value = "test")
	public String  testme() {
		
		return "I AM AVAILABLE!!";
	}

}
