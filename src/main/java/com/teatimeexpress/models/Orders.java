package com.teatimeexpress.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderNumber;
		
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.MERGE)
	@JoinColumn(name = "userId")
	private Users orderUserId;

	private int orderTotal;
	private String orderDescription;
	private String orderTime;
	
	@OneToMany(mappedBy = "orderNumber", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CartItems> orderCart;

	public Orders(Orders order) {
		super();
		this.orderUserId = order.getOrderUserId();
		this.orderTotal = 0;
		this.orderDescription = order.getOrderDescription();
		this.orderTime = order.getOrderTime();
		this.orderCart = order.getOrderCart();
	}
}
