package com.cat.controller;

import com.cat.config.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	@Value("${test}")
	private String test;
	@Value("${url}")
	private String url;

	@Autowired
	private DatabaseConfig databaseConfig;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello world!" + test + " Welcome come to " + url;
	}

	@RequestMapping(value = "/db", method = RequestMethod.GET)
	@GetMapping
	@PostMapping
	@DeleteMapping
	public String db() {
		return databaseConfig.toString();
	}
}
