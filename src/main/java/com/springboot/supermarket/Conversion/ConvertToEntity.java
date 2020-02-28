package com.springboot.supermarket.Conversion;

import java.util.ArrayList;
import java.util.List;
import com.springboot.supermarket.User.Address;
import com.springboot.supermarket.User.Payment;
import com.springboot.supermarket.User.User;
import com.springboot.supermarket.UserEntity.AddressEntity;
import com.springboot.supermarket.UserEntity.PaymentEntity;
import com.springboot.supermarket.UserEntity.UserEntity;

public class ConvertToEntity {
	public static UserEntity ConvertToUserEntity (User user) {
		UserEntity userentity = new UserEntity();
		if(user != null) {
		userentity.setId(user.getId());
		userentity.setUsername(user.getUsername());
		userentity.setAddress(ConvertToAdressEntity(user.getAddress()));
		userentity.setPayment(ConvertToPaymentEntity(user.getPayment()));
		}
		return userentity;
	}
	
	public static AddressEntity ConvertToAdressEntity(Address address) {
		AddressEntity addressentity = new AddressEntity();
		addressentity.setId(address.getId());
		addressentity.setAddress1(address.getAddress1());
		addressentity.setAddress2(address.getAddress2());
		addressentity.setCity(address.getCity());
		addressentity.setCountry(address.getCountry());
		addressentity.setPincode(address.getPincode());
		addressentity.setState(address.getState());
		return addressentity;
	}
	public static List<PaymentEntity> ConvertToPaymentEntity(List<Payment> payments) {
		List<PaymentEntity> paymententity = new ArrayList<PaymentEntity>(); 
		for (Payment payment: payments) {
			PaymentEntity entity = new PaymentEntity();
			entity.setId(payment.getId());
			entity.setCardnumber(payment.getCardnumber());
			entity.setCardType(payment.getCardType());
			entity.setCvv(payment.getCvv());
			entity.setExpiryDate(payment.getExpiryDate());
			paymententity.add(entity);
		}
		return paymententity;
	}

}
