package com.teatimeexpress.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.Addresses;

@Repository
public interface AddressesRepo extends JpaRepository<Addresses, Integer> {
}
