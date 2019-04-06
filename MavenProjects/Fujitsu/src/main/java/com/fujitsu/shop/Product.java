package com.fujitsu.shop;
public class Product
{
	int productId;
	String name;
    String brand;
    int price;
	
	public Product(){
	}
	
	public Product(int productId,String name,String brand,int price) {
	    this.productId =  productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	public void display() {
	 System.out.println("The product id is:"+productId);
	System.out.println("The product name is:"+name);
	System.out.println("The product brand is:"+brand);
	System.out.println("The product price is:"+price);
	}
	}