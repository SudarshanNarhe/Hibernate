package com.Test;

import java.util.List;
import java.util.Scanner;

import com.Dao.CartImp;
import com.model.Cart;


public class CartTest {
		
public static void main(String[] args) {
		
		Cart cart;
		
		int id,result,choice,productid,quantity,userid;
		
		CartImp dao= new CartImp();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******Products********");
		System.out.println("1.Add Product into Cart");
		System.out.println("2.Update Cart Product");
		System.out.println("3.Delete Cart Product");
		System.out.println("4.Show All Cart Products");
		System.out.println("5.Show Cart Product by Id");
		
		System.out.println("\nEnter Choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
			case 1 : 
				System.out.println("Enter a product Id : ");
				productid=sc.nextInt();
				System.out.println("Enter a quantity : ");
				quantity=sc.nextInt();
				System.out.println("Enter a user Id : ");
				userid=sc.nextInt();
				cart= new Cart(productid,quantity,userid);
				result=dao.addProduct(cart);
				if(result>0) {
					System.out.println("Product added Successfully in Cart");
				}else {
					System.out.println("Product NOT added");
				}
				
				break;
				
			case 2 :
				System.out.println("Enter id : ");
				id=sc.nextInt();
				Cart p3=dao.searchProductById(id);
				if(p3==null) {
					System.out.println("Product is not found in Cart");
				}
				else {
					System.out.println("Enter a product Id : ");
					productid=sc.nextInt();
					System.out.println("Enter a quantity : ");
					quantity=sc.nextInt();
					System.out.println("Enter a user Id : ");
					userid=sc.nextInt();
					p3.setProductid(productid);
					p3.setQuantity(quantity);
					p3.setUserid(userid);
					dao.updateCartProduct(p3);
				System.out.println("Product Updated successfully");
				}
				break;
			
			case 3 :
				System.out.println("Enter a id for delete");
				id=sc.nextInt();
				Cart p=dao.searchProductById(id);
				p.setProductid(id);
				dao.deleteCartProduct(p);
				System.out.println("Product deleted Succesfully");
				break;
				
			case 4 :
				List<Cart> clist = dao.showAllCartProducts();
				for(Cart crt : clist) {
					System.out.println(crt);
				}
				break;
				
			case 5 :
				System.out.println("Enter a id : ");
				id = sc.nextInt();
				Cart crd=dao.searchProductById(id);
				if(crd==null) {
					System.out.println("Product is NOT found in Cart");
				}
				else
				System.out.println(crd);
				break;
		}

sc.close();
	}
}
