package com.onmobile.prodmanagement.service;

import java.util.List;

import com.onmobile.prodmanagement.model.Product;

public interface ProductServiceImpl {
	Object productCreation = null;

	String deleteById(int id);

	List<Product> getAllProduct();

	Product getProductById(int id);

	String ProductCreation(Product prod);

	String UpdateProduct(Product prod);

}
