package com.componentMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.utility.DBConnection;

public class EmployeeTest {

	public static void main(String[] args) {
		
		SessionFactory fs = DBConnection.getMyConnection();
		System.out.println("Received SF");
		
		Session session = fs.openSession();
		System.out.println("Session is done");
		
		Transaction trs = session.beginTransaction();
		System.out.println("Transaction is done");

		
		Employee e1 = new Employee("Sudarshan",98000,new Address(101,"424251","Pune"));
		session.save(e1);
		trs.commit();
		
		System.out.println("Data saved successfully");
		
	}
}	
