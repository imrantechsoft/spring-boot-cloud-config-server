package com.configclient.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.configclient.configuration.DBProperties;

@RestController
public class MyController {


	@Autowired
	DBProperties dbProperties;
	
	@RequestMapping("/client")
	public String myClient() {
		return "Client " + dbProperties.getConnection();
	}
}