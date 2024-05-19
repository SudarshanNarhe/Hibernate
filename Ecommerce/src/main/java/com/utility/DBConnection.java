package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {

	public static SessionFactory getMyConnection() {
		Configuration cfg = new Configuration().configure();
		System.out.println("Configuration Done");
		
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("SF Done");
		
		return sf;
	}

}
