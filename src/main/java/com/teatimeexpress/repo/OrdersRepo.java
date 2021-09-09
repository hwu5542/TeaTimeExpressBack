package com.teatimeexpress.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
		
	public Optional<Orders> findByOrderNumber(int order_number);

	public Optional<Orders> findByUserId(int user_id);
	
	public Optional<Orders> findByProductNumber(int product_number);
	
	public Optional<Orders> findByOrderTime(String order_time);
}
