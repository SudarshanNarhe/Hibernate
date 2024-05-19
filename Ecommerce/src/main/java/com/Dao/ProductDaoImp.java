package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Product;
import com.utility.DBConnection;

public class ProductDaoImp implements ProductDao{
	
	SessionFactory sf = DBConnection.getMyConnection();
	Session session = sf.openSession();
	Transaction trs = session.beginTransaction();
	Query<Product> query ;
	
	@Override
	public int addProduct(Product p) {
		
		int i =(int)session.save(p);
		trs.commit();
		return i;
	}

	@Override
	public List<Product> showAllProduct() {
		
		query=session.createQuery("from Product");
		return query.list();
	}

	@Override
	public void updateProduct(Product p) {
		
		session.update(p);
		trs.commit();
	}

	@Override
	public void deleteProduct(Product p) {
		
		session.delete(p);
		trs.commit();
		
	}

	@Override
	public Product searchProductById(int id) {
		
		Product p=session.get(Product.class, id);
		return p;
	}
	
	
	
}
