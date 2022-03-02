package com.teatimeexpress.controllers;

import java.util.List;

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
@CrossOrigin(origins = "http://teatimeexpress.s3.us-east-2.amazonaws.com:3000")
@RequestMapping("teatimeexpress/admin/")
@AllArgsConstructor
public class AdminController {
	private UsersService usersService;
	
	@PostMapping("accounts")
	public ResponseEntity<List<Users>> usersValidate(@RequestBody UsersCredential adminCredential) {
		return ResponseEntity.status(HttpStatus.OK).body(usersService.usersList(adminCredential));
	}
//	
//	@PostMapping("orders")
//	public ResponseEntity<List<Orders>> usersSignUp(@RequestBody UsersCredential newUserCredential) {
//		return ResponseEntity.status(HttpStatus.OK).body(usersService.usersSignUp(newUserCredential));
//	}
//	
//	@PostMapping("inventory")
//	public ResponseEntity<List<Products>> usersSignUp(@RequestBody UsersCredential newUserCredential) {
//		return ResponseEntity.status(HttpStatus.OK).body(usersService.usersSignUp(newUserCredential));
//	}
}