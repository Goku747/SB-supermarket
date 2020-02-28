package com.springboot.supermarket.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.supermarket.Conversion.ConvertToEntity;
import com.springboot.supermarket.Conversion.ConvertToUser;
import com.springboot.supermarket.Repository.UserInterface;
import com.springboot.supermarket.User.User;
import com.springboot.supermarket.UserEntity.UserEntity;

@Service
public class UserService {

	@Autowired
	UserInterface userinterface;

	public UserEntity saveUser(@RequestBody User user) {
		UserEntity userentity = null;
		if (user != null) {
			userentity = ConvertToEntity.ConvertToUserEntity (user);
			userentity = userinterface.save(userentity);
		}
		return userentity;
	}

	public UserEntity deleteByUsername(@RequestParam String username) {
		if (username != null && !username.isEmpty()) {
			userinterface.deleteByUsername(username);
		}
		return null;
	}

	public UserEntity viewByUsername(@RequestParam String username) {
		UserEntity userentity = new UserEntity();
		if (username != null) {
			userentity = userinterface.findByUsername(username);
		}
		return userentity;

	}

	public UserEntity updateUser(@RequestBody User user) {
		UserEntity userentity = null;
		if (user != null) {
			userentity = ConvertToEntity.ConvertToUserEntity(user);
			userentity = userinterface.save(userentity);
		}
		return userentity;

	}

	public Optional<UserEntity> findById(@RequestParam Long id) {
		Optional<UserEntity> userentity = null;
		if (id != null) {
			userentity = userinterface.findById(id);
		}
		return userentity;
	}

}
