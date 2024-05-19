package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Cart;
import com.utility.DBConnection;

public class CartImp implements CartDao{
	
	SessionFactory sf = DBConnection.getMyConnection();
	Session session = sf.openSession();
	Transaction trs = session.beginTransaction();
	Query<Cart> query;
	
	@Override
	public int addProduct(Cart c) {
		int i = (int)session.save(c);
		trs.commit();
		return i;
	}

	@Override
	public List<Cart> showAllCartProducts() {
		query=session.createQuery("from Cart");
		
		return query.list();
	}

	@Override
	public void updateCartProduct(Cart c) {
		
		session.update(c);
		trs.commit();
	}

	@Override
	public void deleteCartProduct(Cart c) {
		session.delete(c);
		trs.commit();
	}

	@Override
	public Cart searchProductById(int id) {
		Cart cart=session.get(Cart.class, id);
		return cart;
	}

}
