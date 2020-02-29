package com.springboot.supermarket.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.supermarket.Conversion.ConvertToUser;
import com.springboot.supermarket.User.Payment;
import com.springboot.supermarket.User.User;
import com.springboot.supermarket.UserEntity.UserEntity;

@Service
public class PaymentService {
	@Autowired
	UserService service;
	public User createorupdatepayments(Long id, Payment payment) {
		User user=null;
		if(id!=null && payment!=null) {
			Optional<UserEntity> userentityop=service.findById(id);
			UserEntity userentity=userentityop.get();
			user=ConvertToUser.ConvertToUser(userentity);
			if(userentity.getPayment()==null) {
			List<Payment> payments = new ArrayList<Payment>();
			payments.add(payment);
			user.setPayment(payments);
			}
			service.updateUser(user);
		}
		return user;
	}
	public User deletepayment(Long id, Long payid) {
		User user=null;
		if(id!=null) {
			Optional<UserEntity> userentityop=service.findById(id);
			UserEntity userentity= userentityop.get();
			user = ConvertToUser.ConvertToUser(userentity);
			if(user.getPayment()==null) {
				System.out.println("Payment is empty");
			}
			else
			{
				List <Payment> payments = new ArrayList<Payment>();
				for(Payment pay:user.getPayment()) {
					if(pay.getId()!=payid) {
						payments.add(pay);
					}
					user.setPayment(payments);
				}
			}
			service.updateUser(user);
			
		}
		return user;
	}

}
