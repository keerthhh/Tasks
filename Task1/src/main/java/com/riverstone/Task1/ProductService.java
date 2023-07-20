package com.riverstone.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
@Autowired
ProductRepo repo;
public void insert(Product product) {
	repo.save(product);
}


}
