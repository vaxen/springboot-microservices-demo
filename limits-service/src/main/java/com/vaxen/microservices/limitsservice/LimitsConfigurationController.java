package com.vaxen.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	Configuration config;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {

		return new LimitConfiguration(config.getMinimum(), config.getMaximum());

	}

}
