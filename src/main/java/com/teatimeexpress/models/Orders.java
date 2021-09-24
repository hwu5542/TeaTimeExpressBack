package com.teatimeexpress.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderNumber;
	
	@ManyToOne
	@JoinColumn(name = "productNumber")
	private Products productNumber;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private Users orderUserId;

	private int orderAmount;
	private String orderDescription;
	private String orderTime;
}
