package com.SIX.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repository.TestRepository;





@RestController
public class SpringControler {
	
	@Autowired
	TestRepository testrepository;

	@RequestMapping("/")
	public Collection<Test> wellcome() {

		Collection<Test> sdf =testrepository.findAll();
		
		return sdf;
	}
	@RequestMapping("/Hello")
	public String myDATA() {
		return "Hello in SIXDEE";
		
		
		
	}

}
