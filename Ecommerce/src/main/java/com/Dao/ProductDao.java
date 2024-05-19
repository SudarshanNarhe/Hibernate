package com.Dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {
	
	public int addProduct(Product p);
	
	public List<Product> showAllProduct();
	
	public void updateProduct(Product p);
	
	public void deleteProduct(Product p);
	
	public Product searchProductById(int id);
	
}
