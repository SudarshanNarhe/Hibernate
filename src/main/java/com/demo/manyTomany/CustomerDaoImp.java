package com.demo.manyTomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.utility.DBConnection;

public class CustomerDaoImp implements CustomerDao{
	
	SessionFactory sf = DBConnection.getMyConnection();
	Session session = sf.openSession();
	Transaction trs = session.beginTransaction();
	Query<Customer> query;
	
	@Override
	public void saveCustomer(Customer c) {
		session.persist(c);
		trs.commit();
		
	}

	@Override
	public List<Customer> showAllCustomer() {
		query=session.createQuery("from Customer");
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
		Customer c=session.get(Customer.class, id);
		return c;
	}

}
