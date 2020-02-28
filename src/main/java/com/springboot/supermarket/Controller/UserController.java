package com.springboot.supermarket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.supermarket.Repository.UserInterface;
import com.springboot.supermarket.UserEntity.UserEntity;

@RestController
@Controller
public class UserController {
	@Autowired
	UserInterface repo;
	
	@RequestMapping("/")
	public	List<UserEntity> AllUsers() {
		return repo.findAll();
	}
	
	@RequestMapping("/saveUser")
	public String saveUser(@RequestBody UserEntity user) {
		repo.save(user);
		return "saveuser.html";
	}

}
