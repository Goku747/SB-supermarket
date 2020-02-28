package com.springboot.supermarket.Conversion;

import java.util.ArrayList;
import java.util.List;

import com.springboot.supermarket.User.Address;
import com.springboot.supermarket.User.Payment;
import com.springboot.supermarket.User.User;
import com.springboot.supermarket.UserEntity.AddressEntity;
import com.springboot.supermarket.UserEntity.PaymentEntity;
import com.springboot.supermarket.UserEntity.UserEntity;

public class ConvertToUser {
	public static User ConvertToUser(UserEntity userentity) {
		User user = new User();
		if (userentity != null) {
			user.setId(userentity.getId());
			user.setAddress(ConvertToAddress(userentity.getAddress()));
			user.setUsername(userentity.getUsername());
			user.setPayment(ConvertToPayment(userentity.getPayment()));
		}
		return user;
	}

	public static Address ConvertToAddress(AddressEntity addressentity) {
		Address address = new Address();
		address.setAddress1(addressentity.getAddress1());
		address.setAddress2(addressentity.getAddress2());
		address.setCity(addressentity.getCity());
		address.setCountry(addressentity.getCountry());
		address.setId(addressentity.getId());
		address.setPincode(addressentity.getPincode());
		address.setState(addressentity.getState());
		return address;
	}

	public static List<Payment> ConvertToPayment(List<PaymentEntity> payments) {
		List<Payment> payment = new ArrayList<Payment>();
		for (PaymentEntity paymententity : payments) {
			Payment pay = new Payment();
			pay.setId(paymententity.getId());
			pay.setCardnumber(paymententity.getCardnumber());
			pay.setCardType(paymententity.getCardType());
			pay.setCvv(paymententity.getCvv());
			pay.setExpiryDate(paymententity.getExpiryDate());
			payment.add(pay);
		}
		return payment;
	}

}
