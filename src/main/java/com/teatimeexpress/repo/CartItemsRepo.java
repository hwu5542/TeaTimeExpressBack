package com.teatimeexpress.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.CartItems;

@Repository
public interface CartItemsRepo extends JpaRepository<CartItems, Integer> {
}
