package com.teatimeexpress.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer> {
	public List<Products> findAllProduct();
	public Optional<Products> findByProductId(int product_id);
}
