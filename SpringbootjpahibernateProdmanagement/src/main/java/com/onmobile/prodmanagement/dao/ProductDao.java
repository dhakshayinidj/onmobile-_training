package com.onmobile.prodmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onmobile.prodmanagement.model.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	List<Product> findByName(String name);
	List<Product> findByPriceBetween(long minSal, long maxSal);
	List<Product> findByPriceLessThan(long Sal);
	
	

}
