package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	@Column(nullable = false)
	private String productname;
	@Column(nullable = false)
	private double productprice;
	@Column(nullable = false)
	private String productdesc;
	
	public Product() {
		
	}

	public Product(int productid, String productname, double productprice, String productdesc) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productdesc = productdesc;
	}

	public Product(String productname, double productprice, String productdesc) {
		super();
		this.productname = productname;
		this.productprice = productprice;
		this.productdesc = productdesc;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productdesc=" + productdesc + "]";
	}
	
}
