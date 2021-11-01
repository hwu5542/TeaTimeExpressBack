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
public class CartItems {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartId;

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="orderNumber")
	private Orders orderNumber;
	
    private String productName;
    private int productNumber;
    private int orderAmount;
    private double orderPrice;
    
    public CartItems(CartItems cartItem) {
    	this.orderNumber = cartItem.getOrderNumber();
    	this.productName = cartItem.getProductName();
    	this.productNumber = cartItem.getProductNumber();
    	this.orderAmount = cartItem.getOrderAmount();
    	this.orderPrice = cartItem.getOrderPrice();
    }
}
