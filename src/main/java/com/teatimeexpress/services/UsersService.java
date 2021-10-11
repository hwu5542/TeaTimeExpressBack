package com.teatimeexpress.services;

import org.hibernate.hql.internal.ast.tree.IsNotNullLogicOperatorNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatimeexpress.models.Users;
import com.teatimeexpress.models.UsersCredential;
import com.teatimeexpress.repo.UsersRepo;
import com.teatimeexpress.services.PasswordService;

import javassist.expr.Instanceof;

@Service
public class UsersService {
	UsersRepo usersRepo;
	PasswordService passwordService;

	@Autowired
	public UsersService(UsersRepo usersRepo, PasswordService passwordService) {
		super();
		this.usersRepo = usersRepo;
		this.passwordService = passwordService;
	}
	
	public Users usersValidate(UsersCredential userCredential) {
		Users user = usersRepo.findByUserUsername(userCredential.getUsername()).orElse(null);
		if (passwordService.validatePassword(userCredential.getPassword(), user.getUserPassword()))
			return user;
		return null;
	}
	
	public Users usersSignUp(UsersCredential userCredential) {
		Users user = usersRepo.findByUserUsername(userCredential.getUsername()).orElse(null);
		if (user == null) {
			user = new Users(userCredential.getUsername(), passwordService.passwordHash(userCredential.getPassword()));
			return usersRepo.save(user);
		}
		return null;
	}
}