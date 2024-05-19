package com.demo.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		SessionFactory sf = com.utility.DBConnection.getMyConnection();
		System.out.println("SessionFactory received Succesfully");
		
		Session session = sf.openSession();
		System.out.println("Session done");
		
		Transaction trs = session.beginTransaction();
		System.out.println("Transaction done");
		
		Customer c1 = new Customer("Sudarshan", "suda@gmail.com", "89089");
		
		session.save(c1);
		
		trs.commit();
		
		System.out.println("Data Stored");
		
	}
	
}
