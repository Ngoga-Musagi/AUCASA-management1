package com.aucasa.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.aucasa.model.User;
import com.aucasa.repository.UserRepository;

@Service
public class UserService {

	 @Autowired
	    private UserRepository repository;

//	    @Autowired
//	    private PasswordEncoder passwordEncoder;
	
	public String addUser(User userInfo) {
//        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system ";
    }
}
