package com.charge.ms.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USER_ADDRESS")
public class User_Address {

	@Id @GeneratedValue
	@Column(name = "ADDRESS_ID")
	private int addressId;
	
//	@Column(name = "USER_ID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID", nullable = false)
	@Getter @Setter
	private User user;
	
	@Column(name = "ADDR_LN1")
	@Getter @Setter
	private String addr_ln1;
	
	@Column(name = "ADDR_LN2")
	@Getter @Setter
	private String addr_ln2;
	
	@Column(name = "ADDR_TYPE")
	@Getter @Setter
	private String addr_type;
	
	@Column(name = "ADDR_CITY")
	@Getter @Setter
	private String city;
	
	@Column(name = "ADDR_STATE")
	@Getter @Setter
	private String state;
	
	@Column(name = "ADDR_COUNTRY")
	@Getter @Setter
	private String country;
	
	@Column(name = "ADDR_PIN")
	@Getter @Setter
	private String pincode;
	
	
}
