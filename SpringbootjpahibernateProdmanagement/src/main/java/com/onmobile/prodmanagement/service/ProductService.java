package com.onmobile.prodmanagement.service;

import javax.validation.Valid;

import com.onmobile.prodmanagement.model.Product;

public interface ProductService {

	String ProductCreation(@Valid Product prod);

}
