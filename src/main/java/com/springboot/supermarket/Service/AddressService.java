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
		User user = null;
		if (id != null) {
			Optional<UserEntity> userentityop = userservice.findById(id);
			UserEntity userentity = userentityop.get();
			user = ConvertToUser.ConvertToUser(userentity);
			user.setAddress(address);
		}
		userservice.updateUser(user);
		return user;
	}

	public User deleteAddress(Long id) {
		User user = null;
		if (id != null) {
			Optional<UserEntity> userentityop = userservice.findById(id);
			UserEntity userentity = userentityop.get();
			user = ConvertToUser.ConvertToUser(userentity);
			if (user.getAddress() != null) {
				Address address = new Address();
				user.setAddress(address);
			}
			userservice.updateUser(user);
		}
		return user;
	}

}
