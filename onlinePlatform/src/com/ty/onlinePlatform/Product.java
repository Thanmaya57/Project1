package com.ty.onlinePlatform;

public class Product implements Comparable<Product>{

	int pid;
	Double price;
	
	public Product(Integer id, Double price) {
		super();
		this.pid = id;
		 
		this.price = price;
	}
	public Integer getId() {
		return pid;
	}
	public void setId(Integer id) {
		this.pid = id;
	}
	 
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + pid +", price=" + price + "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.price.compareTo(o.price);
	}
	 
	
}
