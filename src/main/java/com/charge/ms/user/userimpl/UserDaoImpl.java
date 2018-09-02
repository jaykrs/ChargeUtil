package com.charge.ms.user.userimpl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.charge.ms.user.iuser.UserDAO;
import com.charge.ms.user.model.User;
import com.charge.ms.user.model.User_Address;
import com.charge.ms.util.HibernateSessionManager;

public class UserDaoImpl implements UserDAO {

	
	public static Session session = null;
	public UserDaoImpl(){
		session = HibernateSessionManager.getSessionFactory().openSession();
		
	}
	
	public void createUpdateUser(User user) {
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
	//	session.close();
	}

	public void deleteUser(User u) {
	session.delete(u);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
	return (List<User>) session.createCriteria(User.class).list();
	}

	public User getUser(String username) {
	BigDecimal bg =  (BigDecimal) session.createSQLQuery("select USER_ID from TBL_USER where USERNAME in (:username)").setParameter("username", username).uniqueResult();
	return (User)session.get(User.class,bg.intValue());
	}

	public User loginUser(String uid, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveUpdateAddress(User_Address ua) {
		session.beginTransaction();
		session.saveOrUpdate(ua);
		session.getTransaction().commit();
	//	session.close();
		return true;
	}

	public User_Address getUserAddress(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean createAddress(User_Address ua) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User_Address> getAllUserAddress(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateUserWallet(int userid, int amt) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean setWalletStatus(int userid, boolean status) {
		// TODO Auto-generated method stub
		return false;
	}

}
