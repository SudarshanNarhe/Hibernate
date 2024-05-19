package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartid;
	@Column(nullable = false)
	private int productid;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private int userid;
	
	public Cart() {
		
	}

	public Cart(int cartid, int productid, int quantity, int userid) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.quantity = quantity;
		this.userid = userid;
	}

	public Cart(int productid, int quantity, int userid) {
		super();
		this.productid = productid;
		this.quantity = quantity;
		this.userid = userid;
	}

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", productid=" + productid + ", quantity=" + quantity + ", userid=" + userid
				+ "]";
	}

	
	
}

