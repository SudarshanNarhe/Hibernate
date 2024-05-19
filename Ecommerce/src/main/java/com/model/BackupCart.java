package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="backup_cart")
public class BackupCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int backupid;
	@Column(nullable = false)
	private int cartid;
	@Column(nullable = false)
	private int productid;
	@Column(nullable = false)
	private int quantity;
	
	public BackupCart() {
		
	}

	public BackupCart(int backupid, int cartid, int productid, int quantity) {
		super();
		this.backupid = backupid;
		this.cartid = cartid;
		this.productid = productid;
		this.quantity = quantity;
	}

	public BackupCart(int cartid, int productid, int quantity) {
		super();
		this.cartid = cartid;
		this.productid = productid;
		this.quantity = quantity;
	}

	public int getBackupid() {
		return backupid;
	}

	public void setBackupid(int backupid) {
		this.backupid = backupid;
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

	@Override
	public String toString() {
		return "BackupCart [backupid=" + backupid + ", cartid=" + cartid + ", productid=" + productid + ", quantity="
				+ quantity + "]";
	}
		
}

