package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

  public static void main(String[] args) {
  
    Configuration cfg= new Configuration().configure();
    System.out.println("configuration done");
    
    SessionFactory sf= cfg.buildSessionFactory();
    System.out.println("sessionfactory done");
    
    Session session= sf.openSession();
    System.out.println("Session done");
    
    Transaction trs= session.beginTransaction();
    System.out.println("Transaction done");
    
    Employee e1= new Employee("Sudarshan",60000);
    
    session.save(e1);
    
    trs.commit();
    
    System.out.println("data stored");
  }
}
