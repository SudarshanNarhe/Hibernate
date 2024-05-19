package com.demo.annotation;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class StudentTest {
	
	public static void main(String[] args) {
		
		SessionFactory sf = com.utility.DBConnection.getMyConnection();
		
		Session session = sf.openSession();
		
		Transaction trs = session.beginTransaction();
		
//		Student s1=new Student("suraj",67);
//		session.save(s1);
//		trs.commit();
		System.out.println("Data stored Successfully");
		
		Student std = session.get(Student.class,1);
		System.out.println(std);
		Student std1 = session.get(Student.class, 2);
		System.out.println(std1);
		
		// In this case it will heat only once to the data 
		// check the cache file and use it for second time it will  
		Student std3 = session.get(Student.class,3);
		System.out.println(std3);
		Student std4 = session.get(Student.class, 3);
		System.out.println(std4);
		
		// HQL Demo (Hibernate Query Language)
		System.out.println("Student List...");
		Query<Student> query = session.createQuery("from Student");
		List<Student> slist = query.list();
		
		for(Student s : slist) {
			System.out.println(s);
		}
		
		System.out.println("Using where clause");
		query = session.createQuery("from Student where id=:sid");
		query.setParameter("sid", 2);
		System.out.println(query.list());
		
		System.out.println("Using delete query");
		query = session.createQuery("delete from Student where id=:sid");
		query.setParameter("sid", 3);
		int row=query.executeUpdate();
		trs.commit();
		System.out.println(row + "rows is deleted after -->>");
		
		query = session.createQuery("from Student");
		List<Student> slist1 = query.list();
		
		for(Student s : slist1) {
			System.out.println(s);
		}
		
		
	}
	
}
