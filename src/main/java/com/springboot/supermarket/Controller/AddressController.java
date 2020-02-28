package com.springboot.supermarket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.supermarket.Repository.AddressInterface;
import com.springboot.supermarket.UserEntity.AddressEntity;

@RestController
public class AddressController {
	@Autowired
	AddressInterface add;

	@GetMapping("/addAddress")
		public AddressEntity getAddress(@RequestBody AddressEntity address) {
			add.save(address);
			return address;
		}
	}

