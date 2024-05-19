package com.demo.annotation;

import java.util.List;

public interface CustomerDao {
	
	public int saveCustomer(Customer c);
	
	public List<Customer> showCustomerList();
	
	public void updateCustomer(Customer c);
	
	public void deleteCustomer(Customer c);
	
	public Customer searchCustomerById(int id);
	
}
