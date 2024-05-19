package com.demo.annotation;

import java.util.List;
import java.util.Scanner;

public class CustomerTest1 {
	
	public static void main(String[] args) {
		
		Customer c;
		Scanner sc = new Scanner(System.in);
		int id,choice,result;
		String name,email,contact;
		
		CustomerDao1Imp cdao = new CustomerDao1Imp();
		System.out.println("------Customer------");
		System.out.println("1.Add Customer");
		System.out.println("2.Update Customer");
		System.out.println("3.Delete Customer");
		System.out.println("4.Show Customer List");
		System.out.println("5.Search Customer by id");
		
		System.out.println("\nEnter Choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Enter Name : ");
			name=sc.next();
			System.out.println("Enter email : ");
			email=sc.next();
			System.out.println("Enter contact : ");
			contact =sc.next();
			c=new Customer(name,email,contact);
			result=cdao.saveCustomer(c);
			if(result>0) {
				System.out.println("Customer added Successfully");
			}else {
				System.out.println("Customer is not added");
			}
			break;
		case 2:
			System.out.println("Enter id : ");
			id=sc.nextInt();
			System.out.println("Enter Name : ");
			name=sc.next();
			System.out.println("Enter email : ");
			email=sc.next();
			System.out.println("Enter contact : ");
			contact =sc.next();
			c=new Customer(id,name,email,contact);
			cdao.updateCustomer(c);
			System.out.println("Customer updated");
			break;
			
		case 3:
			System.out.println("Enter id for delete : ");
			id=sc.nextInt();
			c= new Customer();
			c.setId(id);
			cdao.deleteCustomer(c);
			System.out.println("Deleted Successfully");
			break;
			
		case 4: 
			List<Customer> clist=cdao.showCustomerList();
			for(Customer cust : clist) {
				System.out.println(cust);
			}
			break;
		case 5:
			System.out.println("Enter Customer Id for Search : ");
			id = sc.nextInt();
			Customer c1=cdao.searchCustomerById(id);
			System.out.println(c1);
			break;
		}
		
sc.close();		
	}
	
}
