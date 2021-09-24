package com.teatimeexpress.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatimeexpress.models.Login;
import com.teatimeexpress.models.Users;
import com.teatimeexpress.repo.UsersRepo;

@Service
public class UsersService {
	UsersRepo usersRepo;

	@Autowired
	public UsersService(UsersRepo usersRepo) {
		super();
		this.usersRepo = usersRepo;
	}
	
	public Users getUsers(Login userCredential) {
		return usersRepo.findByUserUsername(userCredential.getUsername()).orElseThrow();
	}
}
