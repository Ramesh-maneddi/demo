package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoo {
@GetMapping("/test")
public String test() {
	return "ramesh";
}
}
