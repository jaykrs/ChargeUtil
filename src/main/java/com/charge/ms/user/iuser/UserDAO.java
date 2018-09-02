package com.charge.ms.user.iuser;

import java.util.List;

import com.charge.ms.user.model.User;
import com.charge.ms.user.model.User_Address;

public interface UserDAO {


	public void createUpdateUser(User u);
	public void deleteUser(User u);
	public List<User> getUsers();
	public User getUser(String username);

	
	public User loginUser(String uid, String pwd);
	
	public boolean saveUpdateAddress(User_Address ua);
	public User_Address getUserAddress(int addressId);
	public boolean createAddress(User_Address ua);
	public List<User_Address> getAllUserAddress(int userid);
	
	public boolean updateUserWallet(int userid, int amt);
	public boolean setWalletStatus(int userid, boolean status);
}
