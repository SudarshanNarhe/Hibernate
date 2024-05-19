package com.demo.manyTomany;

import java.util.List;

public interface CustomerDao {
	
	public void saveCustomer(Customer c);
	
	public List<Customer> showAllCustomer();
	
	public void updateCustomer(Customer c);
	
	public void deleteCustomer(Customer c);
	
	public Customer searchCustomerById(int id);
	
}
