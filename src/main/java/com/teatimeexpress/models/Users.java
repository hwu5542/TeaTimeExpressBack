package com.teatimeexpress.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userUsername;
	private String userPassword;
	private String userEmail;
	
	@OneToMany(mappedBy = "AddressUserId", fetch=FetchType.EAGER)
	private List<Addresses> userMailAddress;
	
	private String userPhoneNumber;
	
	public Users(String userUsername, String userPassword) {
		super();
		this.userUsername = userUsername;
		this.userPassword = userPassword;
	}
}
