package com.shop;

public class Product { 
	
	String pid;   //creating instance variable for Product ID
	double price; //creating instance variable for Price
	int quantity; //creating instance variable for quantity
	
	
	public Product (String pid, double price,int quantity)  //Parameterized constructor with attributes to initialize product object 
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}


	public String getPid() {                                //getters and setters method for each product attribute 
		return pid;
	}


	public void setPid(String pid) {
		this.pid = pid;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void getQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
