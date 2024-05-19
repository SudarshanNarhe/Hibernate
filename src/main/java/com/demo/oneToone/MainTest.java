package com.demo.oneToone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.utility.DBConnection;

public class MainTest {
	
	public static void main(String[] args) {
		
		SessionFactory sf = DBConnection.getMyConnection();
		
		Session session = sf.openSession();
		
		Transaction trs = session.beginTransaction();
		
		Department d1 = new Department("IT");
		Department d2 = new Department("sales");
		
		Employee e1 = new Employee("Sudarshan", 890000, d1);
		Employee e2 = new Employee("Suraj", 690000);
		Employee e3 = new Employee("Yogesh", 990000,d1);
		
		
		session.save(e1);
		
		e2.setDepartment(d2);
		d2.setEmployee(e2);
		
		d1.setEmployee(e3);
		
		d1.setEmployee(e1);
		
		session.save(e2);
		session.save(e3);
		trs.commit();
		
		System.out.println("Data saved Successfully");
	}
	
}
