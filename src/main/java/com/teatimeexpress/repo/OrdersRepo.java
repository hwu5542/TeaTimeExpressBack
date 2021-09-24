package com.teatimeexpress.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
		
	public Optional<Orders> findByOrderNumber(int orderNumber);

	public Optional<Orders> findByOrderUserId(int OrderUserId);
	
	public Optional<Orders> findByProductNumber(int productNumber);
	
	public Optional<Orders> findByOrderTime(String orderTime);
}
