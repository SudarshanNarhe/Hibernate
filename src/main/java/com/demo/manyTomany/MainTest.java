package com.demo.manyTomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.utility.DBConnection;

public class MainTest {
	
	public static void main(String[] args) {
		
		SessionFactory sf = DBConnection.getMyConnection();
		
		Session session = sf.openSession();
		
		Transaction trs = session.beginTransaction();
		
		Order o1 = new Order("mobile", 78000);
		Order o2 = new Order("Laptop", 120000);
		Order o3 = new Order("Earbuds", 2000);
		Order o4 = new Order("Mixer", 800);
		
		ArrayList<Order> olist = new ArrayList<>();
		olist.add(o1);
		olist.add(o2);
		olist.add(o3);
		olist.add(o4);

		
		Order o5 = new Order("Book", 780);
		Order o6 = new Order("Charger", 1200);
		Order o7 = new Order("Bag", 2000);
	
		ArrayList<Order> olist2 = new ArrayList<>();
		olist2.add(o5);
		olist2.add(o6);
		olist2.add(o7);
		
		Customer cust1 = new Customer("Sudarshan", olist);
		
		Customer cust2 = new Customer("Yogesh", olist2);
		
		ArrayList<Customer> clist = new ArrayList<>();
		clist.add(cust1);
		clist.add(cust2);
		
		o1.setClist(clist);
		
		session.save(cust1);
		session.save(cust2);
		
		trs.commit();
		
		System.out.println("Data Saved Successfully");
		
	}
}
