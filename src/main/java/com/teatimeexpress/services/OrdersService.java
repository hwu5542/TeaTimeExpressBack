package com.teatimeexpress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatimeexpress.models.Orders;
import com.teatimeexpress.repo.OrdersRepo;

@Service
public class OrdersService {
	OrdersRepo ordersRepo;

	@Autowired
	public OrdersService(OrdersRepo ordersRepo) {
		super();
		this.ordersRepo = ordersRepo;
	}

	public Orders OrdersSearch(int ordersId) {
		return ordersRepo.findByOrderNumber(ordersId).orElse(null);
	}
	
	public List<Orders> OrdersList() {
		return ordersRepo.findAll();
	}
}