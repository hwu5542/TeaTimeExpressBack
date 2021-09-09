package com.teatimeexpress.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_number;
	
	private String product_name;
	private int product_weight;
	private String product_description;
	private int product_stock_amt;
	private int product_order_amt;
	private String product_image;	
}
