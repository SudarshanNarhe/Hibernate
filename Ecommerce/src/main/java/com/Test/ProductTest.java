package com.Test;

import java.util.List;
import java.util.Scanner;

import com.Dao.ProductDaoImp;
import com.model.Product;


public class ProductTest {
	
	public static void main(String[] args) {
		
		Product product;
		
		int id,result,choice;
		String name,desc;
		double price;
		
		ProductDaoImp dao= new ProductDaoImp();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******Products********");
		System.out.println("1.Add Product");
		System.out.println("2.Update Product");
		System.out.println("3.Delete Product");
		System.out.println("4.Show All Products");
		System.out.println("5.Show Product by Id");
		
		System.out.println("\nEnter Choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
			case 1 : 
				System.out.println("Enter a product name : ");
				name=sc.next();
				System.out.println("Enter a price : ");
				price=sc.nextDouble();
				System.out.println("Enter a description : ");
				desc=sc.next();
				product= new Product(name,price,desc);
				result=dao.addProduct(product);
				if(result>0) {
					System.out.println("Product added Successfully");
				}else {
					System.out.println("Product NOT added");
				}
				
				break;
				
			case 2 :
				System.out.println("Enter id : ");
				id=sc.nextInt();
				Product p3=dao.searchProductById(id);
				if(p3==null) {
					System.out.println("Product is not found in list");
				}
				else {
				System.out.println("Enter a product name : ");
				name=sc.next();
				System.out.println("Enter a price : ");
				price=sc.nextDouble();
				System.out.println("Enter a description : ");
				desc=sc.next();
				p3.setProductname(name);
				p3.setProductprice(price);
				p3.setProductdesc(desc);
				dao.updateProduct(p3);
				System.out.println("Product Updated successfully");
				}
				break;
			
			case 3 :
				System.out.println("Enter a id for delete");
				id=sc.nextInt();
				Product p=dao.searchProductById(id);
				p.setProductid(id);
				dao.deleteProduct(p);
				System.out.println("Product deleted Succesfully");
				break;
				
			case 4 :
				List<Product> plist = dao.showAllProduct();
				for(Product prd : plist) {
					System.out.println(prd);
				}
				break;
				
			case 5 :
				System.out.println("Enter a id : ");
				id = sc.nextInt();
				Product prd=dao.searchProductById(id);
				if(prd==null) {
					System.out.println("Product NOT found...");
				}
				else
				System.out.println(prd);
				break;
		}

sc.close();
	}
	
}
