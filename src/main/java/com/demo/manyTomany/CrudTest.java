package com.demo.manyTomany;

import java.util.List;
import java.util.Scanner;

public class CrudTest {
	
	public static void main(String[] args) {
		
		int id,choice,result;
		String name;
//		List<Order> olist;
		CustomerDaoImp dao = new CustomerDaoImp();
		Customer cust = new Customer();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("*******Customer********");
		System.out.println("1.Add Customer");
		System.out.println("2.Update Customer");
		System.out.println("3.Delete Customer");
		System.out.println("4.Search Customer By Id ");
		System.out.println("5.Show All Customers");
		
		System.out.println("\nEnter choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
			case 1 : 
				System.out.println("Enter Customer Name : ");
				name=sc.next();
				cust.setName(name);
				dao.saveCustomer(cust);
			//	System.out.println(result);
				System.out.println("Customer Added Successfully");
				break;
				
			case 2:
				System.out.println("Enter a Customer id : ");
				id=sc.nextInt();
				cust=dao.searchCustomerById(id);
				if(cust==null)
					System.out.println("Customer NOT found");
				else {
					System.out.println("Enter Customer Name : ");
					name=sc.next();
					cust.setName(name);
					dao.updateCustomer(cust);
					System.out.println("Customer Update Successfully");
				}
				break;
				
			case 3:
				System.out.println("Enter a Customer id : ");
				id=sc.nextInt();
				cust=dao.searchCustomerById(id);
				if(cust==null)
					System.out.println("Customer NOT found");
				else {
				cust.setId(id);
				dao.deleteCustomer(cust);
				System.out.println("Customer deleted Successfully");
				}
				break;
			
			case 4:
				System.out.println("Enter a Customer id : ");
				id=sc.nextInt();
				cust=dao.searchCustomerById(id);
				if(cust==null)
					System.out.println("Customer NOT found");
				else {
					System.out.println(cust);
				}
				break;
				
			case 5:
				List<Customer> clist=dao.showAllCustomer();
				for(Customer c : clist) {
					System.out.println(c);
				}
				break;
		}
		
sc.close();
	}
	
}	
