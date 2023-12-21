package com.example.demo.entity;

public class Product {

	public Integer Id;
	public String Name;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Product(Integer id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public Product() {
		super();
	}
	
	
}
