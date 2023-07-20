package com.riverstone.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	@Autowired
	 ProductService pservice;
	@GetMapping("/product")
	@ResponseBody
	public String getdata() {
		Product p =new Product(1, "iphone",50000.00);
		Product p1 =new Product(2, "asus",60000.00);
		Product p2 =new Product(3, "mi",70000.00);
		Product p3 =new Product(4, "poco",80000.00);
		pservice.insert(p);
		pservice.insert(p1);
		pservice.insert(p2);
		pservice.insert(p3);
		return "Done";
	}
}
