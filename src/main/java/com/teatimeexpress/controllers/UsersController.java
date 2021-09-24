package com.teatimeexpress.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teatimeexpress.models.Login;
import com.teatimeexpress.models.Users;
import com.teatimeexpress.services.UsersService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("teatimeexpress/users/")
@AllArgsConstructor
public class UsersController {
	private UsersService usersService;
	
	@GetMapping("login")
	public ResponseEntity<Users> getUsers(@RequestBody Login userCredential) {
		return ResponseEntity.status(HttpStatus.OK).body(usersService.getUsers(userCredential));
	}
}
