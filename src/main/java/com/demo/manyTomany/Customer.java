package com.demo.manyTomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Order> olist;
	
	public Customer() {
		
		
	}


	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer(String name, List<Order> olist) {
		super();
		this.name = name;
		this.olist = olist;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Order> getOlist() {
		return olist;
	}


	public void setOlist(List<Order> olist) {
		this.olist = olist;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}


	


	
	
}
