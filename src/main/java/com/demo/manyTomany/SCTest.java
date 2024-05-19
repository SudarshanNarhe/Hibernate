package com.demo.manyTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.utility.DBConnection;

public class SCTest implements StudentDao{
	
	SessionFactory sf=DBConnection.getMyConnection();
	Session session=sf.openSession();
//	Transaction t=session.beginTransaction();
	Query<Student> query;
	ArrayList<Student> slist;
	@Override
	public void showAllStudents() {
//		System.out.println("inside method");
		query=session.createQuery("from Student");
		slist=(ArrayList<Student>) query.list();
		for(Student s : slist) {
			//System.out.println("inside for");
			System.out.println(s.getSid()+" "+s.getFname()+" "+s.getLname());
			System.out.println("Course List : ");
			List<Course> clist = s.getCourselist();
			for(Course c : clist) {
				System.out.println(c);
			}
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SessionFactory sf=DBConnection.getMyConnection();
//		Session session=sf.openSession();
//		Transaction t=session.beginTransaction();
//		
//		Course c1=new Course("html",5000);
//		Course c2=new Course("css",3000);
//		Course c3=new Course("js",10000);
//		Course c4=new Course("java",50000);
//		
//		Student s1=new Student("neha","patil");
//		s1.setCourselist(List.of(c1,c2));
//		
//		Student s2= new Student("Sudarshan","Narhe");
//		s2.setCourselist(List.of(c3,c2));
//		
//		Student s3 = new Student("Yogesh","Nawale");
//		s3.setCourselist(List.of(c4,c3));
//		
//		c1.setSlist(List.of(s1));
//		c2.setSlist(List.of(s1));
//		c3.setSlist(List.of(s2,s3));
//		c4.setSlist(List.of(s3));
//		
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//		session.save(c1);
//		session.save(c2);
//		session.save(c3);
//		session.save(c4);
//		t.commit();
		
		SCTest obj = new SCTest();
		obj.showAllStudents();
		
		System.out.println("save");
	}

	
}
