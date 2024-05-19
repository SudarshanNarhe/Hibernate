package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {
	
	public static SessionFactory getMyConnection() {
		
		Configuration cfg = new Configuration().configure();
		System.out.println("Configuration done");
		
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("SessionFactory done");
		
		return sf;
		
	}
	
}
