package com.teatimeexpress.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.Orders;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer> {
		
	public Optional<Orders> findByOrderNumber(int orderNumber);

    @Query("SELECT Orders FROM Orders WHERE orderUserId = ?1 AND orderTotal = 0")
    public Optional<Orders> findByOrderUserId(int orderUserId);
	
	public Optional<Orders> findByOrderTime(String orderTime);
}
