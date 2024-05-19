package com.Dao;

import java.util.List;

import com.model.Cart;

public interface CartDao {
	
	public int addProduct(Cart c);
	
	public List<Cart> showAllCartProducts();
	
	public void updateCartProduct(Cart c);
	
	public void deleteCartProduct(Cart c);
	
	public Cart searchProductById(int id);
	
}
