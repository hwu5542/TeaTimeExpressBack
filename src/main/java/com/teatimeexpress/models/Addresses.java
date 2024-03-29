package com.teatimeexpress.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Addresses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private Users addressUserId;
	
	private String addressLineOne;
	private String addressLineTwo;
	private String addressCity;
	private String addressAptSuite;
	private String addressPostcode;
	private String addressCountry;
	private String addressState;
}
