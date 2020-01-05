package com.docker.demo.controller;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PermitAll
public class TesteController {
	
	@GetMapping("/teste")
	public String testController() {
		return "API RUNNING";
	}

}
