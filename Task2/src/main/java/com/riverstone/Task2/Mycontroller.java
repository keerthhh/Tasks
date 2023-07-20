package com.riverstone.Task2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	@Autowired
	FruitsService fservice;
	@Autowired
	FruitsRepo frepo;
	
	@GetMapping("/fruits")
	@ResponseBody
	public String insertdata() {
		Fruits f =new Fruits(1, "BANANA 1KG",50000.00);
		Fruits f1 =new Fruits(2, "FIG 1KG",60000.00);
		Fruits f2 =new Fruits(3, "WATERMELON 1KG",70000.00);
		Fruits f3 =new Fruits(4, "GRAPE 1KG",80000.00);
		fservice.insert(f);
		fservice.insert(f1);
		fservice.insert(f2);
		fservice.insert(f3);
		return "Done";
	}
	@GetMapping("/fruitslist")
	public List<Fruits> getData(){
	List<Fruits> addFruits =fservice.getallfruits();
	for (Fruits temp :addFruits) {
		System.out.println("****************");
		System.out.println("Fruits_num :"+ temp.getnum());
		System.out.println("Fruits_name :"+ temp.getName());
		System.out.println("Fruits_price :"+ temp.getPrice());
	
	}
	return addFruits;
	}
	
}