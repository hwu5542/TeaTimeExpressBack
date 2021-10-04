package com.teatimeexpress.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teatimeexpress.models.Orders;
import com.teatimeexpress.services.OrdersService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("teatimeexpress/orders")
public class OrdersController {
	OrdersService ordersService;
	
	@GetMapping("getAll")
	public ResponseEntity<List<Orders>> ordersList() {
		return ResponseEntity.status(HttpStatus.OK).body(ordersService.OrdersList());
	}
	
	@GetMapping("get/{ordersId}")
	public ResponseEntity<Orders> ordersSearch(@PathVariable int ordersId) {
		return ResponseEntity.status(HttpStatus.OK).body(ordersService.OrdersSearch(ordersId));
	}
}
