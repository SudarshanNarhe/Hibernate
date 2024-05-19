package com.demo.oneTomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.utility.DBConnection;

public class MainTest {
	
	public static void main(String[] args) {
		
		SessionFactory sf= DBConnection.getMyConnection();
		
		Session session = sf.openSession();
		
		Transaction trs = session.beginTransaction();
		
//		Question q1 = new Question();
//		
//		q1.setQuename("What is Java ?");
//		
//		Answer ans1= new Answer();
//		ans1.setAnswername("Java is a high level Programming Langauge");
//		ans1.setPostedBy("YN");
//		
//		Answer ans2= new Answer();
//		ans2.setAnswername("Java is a platform independant language");
//		ans2.setPostedBy("SR");
//		
//		Answer ans3= new Answer();
//		ans3.setAnswername("Java is a platform multithreaded, robust language");
//		ans3.setPostedBy("SN");
//		
//		ArrayList<Answer> answers = new ArrayList<>();
//		answers.add(ans1);
//		answers.add(ans2);
//		answers.add(ans3);
//		q1.setAnswers(answers);
//		
//		session.save(q1);
		
		Question q2 = new Question();
		
		q2.setQuename("Which datatypes used in Java ?");
		
		Answer ans4= new Answer();
		ans4.setAnswername("String");
		ans4.setPostedBy("SD");
		
		Answer ans5= new Answer();
		ans5.setAnswername("int");
		ans5.setPostedBy("MK");
		
		Answer ans6= new Answer();
		ans6.setAnswername("double");
		ans6.setPostedBy("SK");
		
		ArrayList<Answer> answers = new ArrayList<>();
		answers.add(ans4);
		answers.add(ans5);
		answers.add(ans6);
		q2.setAnswers(answers);
		
		session.save(q2);
		
		trs.commit();
		System.out.println("Data Saved successfully");
	}
	
}
