package com.charge.ms.user.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

public class ManagedEntity {

	@Id @GeneratedValue
	@Column(name = "ENTITY_ID")
	@Getter @Setter
	private int entityId;

	
	
}
