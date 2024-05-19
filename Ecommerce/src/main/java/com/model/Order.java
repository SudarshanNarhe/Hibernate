package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_items")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	@Column(nullable = false)
	private int productid;
	@Column(nullable = false)
	private int userid;
	@Column(nullable = false)
	private String date;
	@Column(nullable = false)
	private double totalorder;
	@Column(nullable = false,columnDefinition ="VARCHAR(100) DEFAULT 'Processing'")
	private String orderstatus;
	@Column(nullable = false)
	private String paymentmode;
	
	public Order() {
		
	}

	public Order(int orderid, int productid, int userid, String date, double totalorder, String orderstatus,
			String paymentmode) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.userid = userid;
		this.date = date;
		this.totalorder = totalorder;
		this.orderstatus = orderstatus;
		this.paymentmode = paymentmode;
	}

	public Order(int productid, int userid, String date, double totalorder, String orderstatus, String paymentmode) {
		super();
		this.productid = productid;
		this.userid = userid;
		this.date = date;
		this.totalorder = totalorder;
		this.orderstatus = orderstatus;
		this.paymentmode = paymentmode;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTotalorder() {
		return totalorder;
	}

	public void setTotalorder(double totalorder) {
		this.totalorder = totalorder;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", productid=" + productid + ", userid=" + userid + ", date=" + date
				+ ", totalorder=" + totalorder + ", orderstatus=" + orderstatus + ", paymentmode=" + paymentmode + "]";
	}
	
	
	
}
