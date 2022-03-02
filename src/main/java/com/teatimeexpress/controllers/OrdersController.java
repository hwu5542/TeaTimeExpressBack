package com.teatimeexpress.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teatimeexpress.models.CartItems;
import com.teatimeexpress.models.Orders;
import com.teatimeexpress.models.Users;
import com.teatimeexpress.services.OrdersService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://teatimeexpress.s3.us-east-2.amazonaws.com:3000")
@RequestMapping("teatimeexpress/orders")
@AllArgsConstructor
public class OrdersController {
	OrdersService ordersService;
	
	@GetMapping("getAll")
	public ResponseEntity<List<Orders>> ordersList() {
		return ResponseEntity.status(HttpStatus.OK).body(ordersService.ordersList());
	}
	
	@GetMapping("get/{ordersId}")
	public ResponseEntity<Orders> ordersSearch(@PathVariable int ordersId) {
		return ResponseEntity.status(HttpStatus.OK).body(ordersService.ordersSearch(ordersId));
	}
		
	@PostMapping("checkout")
	public ResponseEntity<Orders> ordersCheckout(@RequestBody List<CartItems> newCart) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ordersService.ordersCheckout(newCart));
	}
}
