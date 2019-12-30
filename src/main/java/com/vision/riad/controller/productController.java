package com.vision.riad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class productController {
	
	
	
	@RequestMapping("product")
	public String test() {
		return "Product Testing";
	}
	
	

}
