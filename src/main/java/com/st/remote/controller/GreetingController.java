package com.st.remote.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping(value = "/greeting")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return "Greetings " + name;
    }
	
}
