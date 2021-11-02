package com.teatimeexpress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatimeexpress.models.CartItems;
import com.teatimeexpress.models.Orders;
import com.teatimeexpress.models.Users;
import com.teatimeexpress.repo.CartItemsRepo;
import com.teatimeexpress.repo.OrdersRepo;

@Service
public class OrdersService {
	OrdersRepo ordersRepo;
	CartItemsRepo cartItemsRepo;

	@Autowired
	public OrdersService(OrdersRepo ordersRepo) {
		super();
		this.ordersRepo = ordersRepo;
	}

	public Orders ordersSearch(int ordersId) {
		return ordersRepo.findByOrderNumber(ordersId).orElse(null);
	}
	
	public List<Orders> ordersList() {
		return ordersRepo.findAll();
	}
	
	public Orders ordersCheckout(List<CartItems> newCart) {
		cartItemsRepo.saveAll(newCart);
		return ordersRepo.findByOrderNumber(newCart.get(0).getOrderNumber().getOrderNumber()).orElse(null);
	}
}