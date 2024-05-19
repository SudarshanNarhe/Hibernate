package com.inheritance.tph;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.utility.DBConnection;

public class StudentPersonTest {

	public static void main(String[] args) {
		
		SessionFactory sf = DBConnection.getMyConnection();
		System.out.println("Received SF");
		
		Session session = sf.openSession();
		System.out.println("Session is done");
		
		Transaction trs = session.beginTransaction();
		System.out.println("Transaction is done");
		
		Person p = new Person("Sudarshan",24,"suda@gmail.com");
		session.save(p);
	//	trs.commit();
		System.out.println("Data saved successfully");
		
		Student st = new Student ("Suraj",42,"suraj@gmail.com",105,78);
		session.save(st);
		
		Teacher t = new Teacher("Yogesh",45,"yogi4@gmail.com","B.ed",98000);
		session.save(t);
		
		trs.commit();
		System.out.println("Data Saved Successfully");

	}

}
