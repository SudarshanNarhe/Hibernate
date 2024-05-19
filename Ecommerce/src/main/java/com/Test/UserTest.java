package com.Test;

import java.util.List;
import java.util.Scanner;

import com.Dao.UserDaoImp;
import com.model.User;


public class UserTest {
	
public static void main(String[] args) {
		
		User user;
		
		int id,result,choice;
		String firstname,lastname,contact,email,userrole;
		
		UserDaoImp dao= new UserDaoImp();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******Products********");
		System.out.println("1.Add User");
		System.out.println("2.Update User");
		System.out.println("3.Delete User");
		System.out.println("4.Show All Users");
		System.out.println("5.Show User by Id");
		
		System.out.println("\nEnter Choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
			case 1 : 
				System.out.println("Enter a User firstname : ");
				firstname=sc.next();
				System.out.println("Enter a User lastname : ");
				lastname=sc.next();
				System.out.println("Enter a contact : ");
				contact=sc.next();
				System.out.println("Enter a email : ");
				email=sc.next();
				System.out.println("Enter a userrole : ");
				userrole=sc.next();
				user= new User(firstname,lastname,contact,email,userrole);
				result=dao.addUser(user);
				if(result>0) {
					System.out.println("Product added Successfully");
				}else {
					System.out.println("Product NOT added");
				}
				
				break;
				
			case 2 :
				System.out.println("Enter id : ");
				id=sc.nextInt();
				User p3=dao.searchUserById(id);
				if(p3==null) {
					System.out.println("User is not found in list");
				}
				else {
					System.out.println("Enter a User firstname : ");
					firstname=sc.next();
					System.out.println("Enter a User lastname : ");
					lastname=sc.next();
					System.out.println("Enter a contact : ");
					contact=sc.next();
					System.out.println("Enter a email : ");
					email=sc.next();
					System.out.println("Enter a userrole : ");
					userrole=sc.next();
					p3.setFirstname(firstname);
					p3.setLastname(lastname);
					p3.setContact(contact);
					p3.setEmail(email);
					p3.setUserrole(userrole);
				dao.updateProduct(p3);
				System.out.println("Product Updated successfully");
				}
				break;
			
			case 3 :
				System.out.println("Enter a id for delete");
				id=sc.nextInt();
				User p=dao.searchUserById(id);
				p.setUserid(id);
				dao.deleteProduct(p);
				System.out.println("Product deleted Succesfully");
				break;
				
			case 4 :
				List<User> ulist = dao.showAllUsers();
				for(User u : ulist) {
					System.out.println(u);
				}
				break;
				
			case 5 :
				System.out.println("Enter a id : ");
				id = sc.nextInt();
				User u1=dao.searchUserById(id);
				if(u1==null) {
					System.out.println("No User found...");
				}else
				System.out.println(u1);
				break;
		}

sc.close();
	}
	
}
