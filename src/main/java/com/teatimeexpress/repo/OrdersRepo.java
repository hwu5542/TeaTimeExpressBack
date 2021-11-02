package com.teatimeexpress.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.Orders;
import com.teatimeexpress.models.Users;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
		
	public Optional<Orders> findByOrderNumber(int orderNumber);

	public Optional<Orders> findByOrderTime(String orderTime);
}
