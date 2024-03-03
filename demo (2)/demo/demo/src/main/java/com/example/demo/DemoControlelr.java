package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoControlelr {

	@GetMapping("/get")
	public String a() {
		return "saiteja";
	} 
	
	@GetMapping("/exclude")
	public String b() {
		return "teja some data";
	} 
}
