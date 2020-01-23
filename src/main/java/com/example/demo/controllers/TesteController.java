package com.example.demo.controllers;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PermitAll
@RequestMapping("teste")
public class TesteController {

	@GetMapping("/controller")
	public String  teste() {

		return "<h1> We Are Running on Heroku! :) Updated </h1>";
	}
	
	
}
