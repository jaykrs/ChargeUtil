package com.charge.ms.user.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



	@Entity
	@Table(name = "TBL_USER")
	public class User implements Serializable{
	 
	/**
		 * 
		 */
		private static final long serialVersionUID = -5193460472845697957L;

	@Id @GeneratedValue
	@Column(name = "USER_ID")
	private int userId;
	 
	@Column(name = "USERNAME")
	@Getter @Setter
	private String username;
	 
	@Column(name = "CREATED_BY")
	@Getter @Setter
	private String createdBy;
	 
	@Column(name = "CREATED_DATE")
	@Getter @Setter
	private Date createdDate;
	
	@Column(name = "ROLE")
	@Getter @Setter
	private String role;
	
	@Column(name = "PASSCODE")
	@Getter @Setter
	private String passcode;
	
	@Column(name = "FNAME")
	@Getter @Setter
	private String fname;
	
	@Column(name = "LNAME")
	@Getter @Setter
	private String lname;
	
	@Column(name = "MNAME")
	@Getter @Setter
	private String mname;
	
	@Column(name = "DOB")
	@Getter @Setter
	private Date dob;
	
	@Column(name = "EMAIL")
	@Getter @Setter
	private String email;
	
	@Column(name = "PHONE")
	@Getter @Setter
	private String phone;
	
	@Column(name = "ACT_STATUS")
	@Getter @Setter
	private boolean userStatus;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	@Getter @Setter
	public Collection<User_Address> userAddressList = new HashSet<User_Address>(0);;
	/*public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isUserStatus() {
		return userStatus;
	}
	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}*/

	
}
