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
	private int order_number;
	
	@ManyToOne
	@JoinColumn(name = "product_number")
	private Products product_number;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users order_user_id;

	private int order_amount;
	private String order_description;
	private String Order_time;
}
