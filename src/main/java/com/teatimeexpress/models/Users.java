package com.teatimeexpress.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	private String userLastName;
	private String userFirstName;
	private String userEmail;
	private String userPhoneNumber;
	private String userImage;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private Addresses userBillAddress;
	
	@OneToMany(mappedBy = "addressUserId", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Addresses> userMailAddress;
	
	public Users(String userUsername, String userPassword) {
		super();
		this.userUsername = userUsername;
		this.userPassword = userPassword;
	}
}
