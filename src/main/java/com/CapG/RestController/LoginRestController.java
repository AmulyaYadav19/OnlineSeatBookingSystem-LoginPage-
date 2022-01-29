package com.CapG.RestController;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CapG.Model.User;
import com.CapG.Service.LoginService;
@RestController
public class LoginRestController 
{
	@Autowired
	LoginService service;
	
	@GetMapping("/login")
		public ResponseEntity createUser(@Validated @RequestBody User user)
		{
		User us=service.login(user.getUsername(), user.getPassword());
		
		if(Objects.nonNull(us))
		{
			return ResponseEntity.ok().body("Login successfully");
		}
		else
		{
			return ResponseEntity.ok().body("Incorrect username or password");
			
		}
			
		}
	
	
}

