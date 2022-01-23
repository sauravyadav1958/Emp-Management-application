package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;



@Service
public class CustomUserDetailsService {
 
    @Autowired
    private UserRepository userRepo;
     

    public User login(String email, String password) {
   
    	User  user = userRepo.findByEmail(email, password);
    	return user;
        
    }
 
}

