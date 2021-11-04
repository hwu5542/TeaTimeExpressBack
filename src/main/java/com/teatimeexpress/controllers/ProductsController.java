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

import com.teatimeexpress.models.Products;
import com.teatimeexpress.services.ProductsService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://teatimeexpress.s3.us-east-2.amazonaws.com")
@RequestMapping("teatimeexpress/products/")
@AllArgsConstructor
public class ProductsController {
	private ProductsService productsService;
	
	@GetMapping("get/{productId}")
	public ResponseEntity<Products> productsSearch(@PathVariable int productId) {
		return ResponseEntity.status(HttpStatus.OK).body(productsService.productsSearch(productId));
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<Products>> productsList() {
		return ResponseEntity.status(HttpStatus.OK).body(productsService.productsList());
	}
	
	@PostMapping("update")
	public ResponseEntity<List<Products>> productsUpdate(@RequestBody List<Products> newProductsList) {
		return ResponseEntity.status(HttpStatus.OK).body(productsService.productsUpdate(newProductsList));
	}
}
