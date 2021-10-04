package com.teatimeexpress.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teatimeexpress.models.Users;
import com.teatimeexpress.models.UsersCredential;
import com.teatimeexpress.services.UsersService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("teatimeexpress/users/")
public class UsersController {
	private UsersService usersService;
	
	@PostMapping("login")
	public ResponseEntity<Users> usersValidate(@RequestBody UsersCredential userCredential) {
		return ResponseEntity.status(HttpStatus.OK).body(usersService.usersValidate(userCredential));
	}
	
	@PostMapping("signUp")
	public ResponseEntity<Users> usersSignUp(@RequestBody UsersCredential newUserCredential) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usersService.usersSignUp(newUserCredential));
	}
}
