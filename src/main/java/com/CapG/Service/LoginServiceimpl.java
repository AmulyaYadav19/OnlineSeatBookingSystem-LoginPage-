package com.CapG.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CapG.Model.User;
import com.CapG.Repository.LoginRepository;

@Service
public class LoginServiceimpl implements LoginService
{
	
	@Autowired
	LoginRepository repo;
	
	public User login(String username,String password)
	{
		User user=repo.findByUsernameAndPassword(username,password);
		return user;
	}
	
	
	

	}

