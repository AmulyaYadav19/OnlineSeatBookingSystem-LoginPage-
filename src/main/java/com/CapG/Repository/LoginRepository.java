package com.CapG.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CapG.Model.User;

public interface LoginRepository extends JpaRepository<User, Integer>
{
	User findByUsernameAndPassword(String username,String password);


}