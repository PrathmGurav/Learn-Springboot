package com.LearnSpringBoot.Learn_SpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retriveAllCourses() {
		return currencyServiceConfiguration;

	}
}
	
