package com.demo.annotation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.utility.DBConnection;

public class CustomerDao1Imp implements CustomerDao{
	
	SessionFactory sf = DBConnection.getMyConnection();
	Session session = sf.openSession();
	Transaction trs = session.beginTransaction();
	Query<Customer> query;
	
	@Override
	public int saveCustomer(Customer c) {
		
		int i = (int) session.save(c);
		//System.out.println(i);
		trs.commit();
		return i;
	}

	@Override
	public List<Customer> showCustomerList() {
		
		query= session.createQuery("from Customer");
		return query.list();
	}

	@Override
	public void updateCustomer(Customer c) {
		
		session.update(c);
		trs.commit();
		
	}

	@Override
	public void deleteCustomer(Customer c) {
		
		session.delete(c);
		trs.commit();
	}

	@Override
	public Customer searchCustomerById(int id) {
		
		Customer c2 = session.get(Customer.class, id);
		return c2;
	}

}
