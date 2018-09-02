package com.charge.ms.user.model;

import lombok.Getter;
import lombok.Setter;

public class User_Wallet {

	@Getter @Setter
	private int walletId;
	@Getter @Setter
	private int userId;
	@Getter @Setter
	private int wallet_balance;
	@Getter @Setter
	private int wallet_status;
	
	/*public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getWallet_balance() {
		return wallet_balance;
	}
	public void setWallet_balance(int wallet_balance) {
		this.wallet_balance = wallet_balance;
	}
	public int getWallet_status() {
		return wallet_status;
	}
	public void setWallet_status(int wallet_status) {
		this.wallet_status = wallet_status;
	}*/
}
