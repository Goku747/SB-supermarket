package com.springboot.supermarket.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.supermarket.Conversion.ConvertToUser;
import com.springboot.supermarket.User.Address;
import com.springboot.supermarket.User.User;
import com.springboot.supermarket.UserEntity.UserEntity;

@Service
public class AddressService {
	@Autowired
	UserService userservice;

	public User CreateorUpdateAddress(Long id, Address address) {
		Optional<UserEntity> userentityop = userservice.findById(id);
		UserEntity userentity = userentityop.get();
		User user = ConvertToUser.ConvertToUser(userentity);
		if (address != null) {
			user.setAddress(address);
		}
		userservice.updateUser(user);
		return user;

	}
	

}
