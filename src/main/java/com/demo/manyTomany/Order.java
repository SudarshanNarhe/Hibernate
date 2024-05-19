package com.demo.manyTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cust_Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prdid;
	private String prdname;
	private double price;
	@ManyToMany
	private List<Customer> clist;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int prdid, String prdname, double price) {
		super();
		this.prdid = prdid;
		this.prdname = prdname;
		this.price = price;
	}

	public Order(String prdname, double price) {
		super();
		this.prdname = prdname;
		this.price = price;
	}
	
	public Order(String prdname, double price, List<Customer> clist) {
		super();
		this.prdname = prdname;
		this.price = price;
		this.clist = clist;
	}

	public List<Customer> getClist() {
		return clist;
	}

	public void setClist(List<Customer> clist) {
		this.clist = clist;
	}

	public int getPrdid() {
		return prdid;
	}

	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}

	public String getPrdname() {
		return prdname;
	}

	public void setPrdname(String prdname) {
		this.prdname = prdname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [prdid=" + prdid + ", prdname=" + prdname + ", price=" + price + ", clist=" + clist + "]";
	}
	
	


	
}
