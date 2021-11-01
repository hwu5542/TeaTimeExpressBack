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
		
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Users orderUserId;

	private int orderTotal;
	private String orderDescription;
	private String orderTime;
	
	@OneToMany(mappedBy = "orderNumber", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CartItems> orderCart;

	public Orders(Users orderUserId) {
		super();
		this.orderUserId = orderUserId;
		this.orderTotal = 0;
		this.orderDescription = "";
		this.orderTime = "";
	}
}
