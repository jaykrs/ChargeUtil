package com.charge.ms.user.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.charge.ms.user.iuser.UserDAO;
import com.charge.ms.user.model.User;
import com.charge.ms.user.model.User_Address;
import com.charge.ms.user.userimpl.UserDaoImpl;
import com.charge.ms.util.AESEncryption;
import com.charge.ms.util.HibernateSessionManager;

import antlr.collections.List;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User();
		String uname = "jayant.kumari@ust2-global.com";
		user.setUsername(uname);
		user.setCreatedBy("Application");
		user.setCreatedDate(new Date());
		user.setRole("VIEW");
		user.setFname("jayant");
		user.setLname("kumari");
		try {
			user.setPasscode(AESEncryption.encryptText(uname));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Session session = HibernateSessionManager.getSessionFactory().openSession();
		
		UserDAO uimpl = new UserDaoImpl();
//		session.beginTransaction();
//		uimpl.createUpdateUser(user);
		User us = uimpl.getUser(uname);
		User_Address userAddress = new User_Address();
		userAddress.setAddr_ln1("Karyanpalya");
		userAddress.setAddr_ln2("HRBR Layout");
		userAddress.setAddr_type("Home2");
		userAddress.setCity("Bangalore");
		userAddress.setState("KA");
		userAddress.setCountry("India");
		userAddress.setPincode("560084");
		userAddress.setUser(us);
//		user.getUserAddressList().add(userAddress);
		uimpl.saveUpdateAddress(userAddress);
//		session.getTransaction().commit();
//		session.close();
		//		user.setUserAddressList(addrList);
//		System.out.println(uimpl.getUsers().size());
		HibernateSessionManager.shutdown();
		/*Session session = HibernateSessionManager.getSessionFactory().openSession();
		 
		session.beginTransaction();
		User user = new User();
		String uname = "jayant.kumar@ust-global.com";
	//	user.setUserId(3);
		user.setUsername(uname);
		user.setCreatedBy("Application");
		user.setCreatedDate(new Date());
		user.setRole("VIEW");
		user.setFname("jayant");
		user.setLname("kumar");
		try {
			user.setPasscode(AESEncryption.encryptText(uname));
		} catch (Exception e) {
					e.printStackTrace();
		}
		session.save(user);
		session.getTransaction().commit();
	session.close();	
	
		HibernateSessionManager.shutdown();
*/	}

}
