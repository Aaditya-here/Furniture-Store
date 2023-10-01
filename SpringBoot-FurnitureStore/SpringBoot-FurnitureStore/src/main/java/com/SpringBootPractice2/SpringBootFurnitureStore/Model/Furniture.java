package com.SpringBootPractice2.SpringBootFurnitureStore.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Furniture {

	@Id
	int id;
	String productName;
	String price;

	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Furniture(int id, String productName, String price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Furniture [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}

}
