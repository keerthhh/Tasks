package com.riverstone.Task2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class FruitsService {
	@Autowired
	FruitsRepo repo;
	public void insert(Fruits fruits) {
		repo.save(fruits);
	}
	public List<Fruits>getallfruits(){
		return repo.findAll();
	}
	
}
