package com.wp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Vehicle {

	@Id
	private String regno;
	private String Brand;
	private String model;
	private int Price;
	
	@ManyToOne
	private Emp emp;

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Emp getEmployee() {
		return emp;
	}

	public void setEmployee(Emp employee) {
		this.emp = employee;
	}

	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", Brand=" + Brand + ", model=" + model + ", Price=" + Price + ", employee="
				+ emp + "]";
	}
	

	public Vehicle(String regno) {
		super();
		this.regno = regno;
	}

	public Vehicle(String regno, String brand, String model, int price,Emp employee) {
		super();
		this.regno = regno;
		Brand = brand;
		this.model = model;
		Price = price;
		this.emp = employee;
	}

	public Vehicle() {
		super();
	}
	
	
}

