package com.onmobile.prodmanagement.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.onmobile.prodmanagement.model.Product;

import com.onmobile.prodmanagement.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping("/addProduct")
	public String createProduct(@Valid @RequestBody Product prod) {
		return service.ProductCreation(prod);
	}
}
