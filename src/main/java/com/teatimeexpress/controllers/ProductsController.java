package com.teatimeexpress.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teatimeexpress.models.Products;
import com.teatimeexpress.services.ProductsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("teatimeexpress/products/")
public class ProductsController {
	private ProductsService productsService;
	
	@GetMapping("get/{productsID}")
	public ResponseEntity<Products> productsSearch(@PathVariable int productsId) {
		return ResponseEntity.status(HttpStatus.OK).body(productsService.productsSearch(productsId));
	}
	
	@GetMapping
	public ResponseEntity<List<Products>> productsList() {
		return ResponseEntity.status(HttpStatus.OK).body(productsService.productsList());
	}
}