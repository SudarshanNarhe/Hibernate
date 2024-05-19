package com.Dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	
	public int addUser(User c);
	
	public List<User> showAllUsers();
	
	public void updateProduct(User c);
	
	public void deleteProduct(User c);
	
	public User searchUserById(int id);

}
