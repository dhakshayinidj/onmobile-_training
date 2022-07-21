package com.onmobile.prodmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "onmobile_prod")
public class Product {
	
	@Id
	@Column(name = "prodid")
	@Min(value = 10)
	@Max(value = 10000)
	private int id;// 2000
	@NotNull(message = "name cannot be null")
	@NotEmpty(message = "name cannot be empty")
	@Column(name = "prodname", length = 15)
	private String name;
	@Column(name="prodprice")
	@NotNull(message = "price cannot be null")
	@NotEmpty(message="price cannot be empty")
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(@Min(10) @Max(10000) int id,
			@NotNull(message = "name cannot be null") @NotEmpty(message = "name cannot be empty") String name,
			@NotNull(message = "price cannot be null") @NotEmpty(message = "price cannot be empty") int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
