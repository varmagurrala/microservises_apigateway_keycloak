package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo2")
	public String demo() {
		
		return "demo2 Application";
	}
}
