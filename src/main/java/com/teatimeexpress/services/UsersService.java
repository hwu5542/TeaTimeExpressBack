package com.teatimeexpress.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatimeexpress.models.Addresses;
import com.teatimeexpress.models.Users;
import com.teatimeexpress.models.UsersCredential;
import com.teatimeexpress.repo.AddressesRepo;
import com.teatimeexpress.repo.UsersRepo;

@Service
public class UsersService {
	UsersRepo usersRepo;
	AddressesRepo addressesRepo;
	PasswordService passwordService;

	@Autowired
	public UsersService(UsersRepo usersRepo, AddressesRepo addressesRepo, PasswordService passwordService) {
		super();
		this.usersRepo = usersRepo;
		this.addressesRepo = addressesRepo;
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
	
	public Users usersUpdate(Users userProfile) {
		try {
			userProfile.getUserMailAddress().forEach(mailAddress->{
				mailAddress.setAddressUserId(userProfile);
				if (mailAddress.getAddressId() == 0) {
					mailAddress = new Addresses(mailAddress);
				}
			});
		}
		catch (NullPointerException e) {/*ignore NullPointerException*/}
		
		return usersRepo.save(userProfile);
	}
}