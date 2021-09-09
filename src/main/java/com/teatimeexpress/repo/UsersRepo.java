package com.teatimeexpress.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatimeexpress.models.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
	public Optional<Users> findByUserId(int user_id);
}
