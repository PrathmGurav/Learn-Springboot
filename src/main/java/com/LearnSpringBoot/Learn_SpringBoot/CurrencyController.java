package com.LearnSpringBoot.Learn_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@RequestMapping("/currencyConfiguration")
	public CurrencyServiceConfiguration retriveAllCourses() {
		return currencyServiceConfiguration;
	}
}
