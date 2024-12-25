package com.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int id;
	private String brandName;
	private double price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return brandName;
	}

	public void setName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	



	public Mobile(int id, String  brandName, double price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.price = price;
	}
	public Mobile(){
		super();
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + brandName + ", price=" + price + "]";
	}
	
	
}
