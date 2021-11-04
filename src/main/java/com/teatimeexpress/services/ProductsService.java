package com.teatimeexpress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatimeexpress.models.Products;
import com.teatimeexpress.repo.ProductsRepo;

@Service
public class ProductsService {
	private ProductsRepo productsRepo;

	@Autowired
	public ProductsService(ProductsRepo productsRepo) {
		super();
		this.productsRepo = productsRepo;
	}
	
	public Products productsSearch(int productsId) {
		return productsRepo.findByProductId(productsId).orElse(null);
	}
	
	public List<Products> productsList() {
		return productsRepo.findAll();
	}
	
	public List<Products> productsUpdate(List<Products> newProductsList) {
		return productsRepo.saveAll(newProductsList);
	}
}
