package com.demo.manyToone;

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
		
		Project p = new Project ("VaccinationProcess","Java");
		
		Student s1= new Student("Sudarshan",p,"front-end");
		Student s2= new Student("Yogesh",p,"back-end");
		Student s3= new Student("Suraj",p,"testing");
		
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		p.setSlist(slist);
		
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
		
		session.save(p);
		
		trs.commit();
		System.out.println("Data Saved Successfully");
	}

}
