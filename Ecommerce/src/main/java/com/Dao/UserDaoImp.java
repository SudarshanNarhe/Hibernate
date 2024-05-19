package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.User;
import com.utility.DBConnection;

public class UserDaoImp implements UserDao{

	SessionFactory sf = DBConnection.getMyConnection();
	Session session = sf.openSession();
	Transaction trs = session.beginTransaction();
	Query<User> query;
	
	@Override
	public int addUser(User c) {
		int i = (int )session.save(c);
		trs.commit();
		return i;
	}

	@Override
	public List<User> showAllUsers() {
		query=session.createQuery("from User");
		return query.list();
	}

	@Override
	public void updateProduct(User c) {
		
		session.update(c);
		trs.commit();
		
	}

	@Override
	public void deleteProduct(User c) {
		session.delete(c);
		trs.commit();
		
	}

	@Override
	public User searchUserById(int id) {
		User user=session.get(User.class, id);
		return user;
	}

}
