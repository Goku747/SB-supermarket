package com.springboot.supermarket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.supermarket.Repository.PaymentInterface;
import com.springboot.supermarket.UserEntity.PaymentEntity;

@RestController
public class PaymentController {
	@Autowired
	PaymentInterface pay;
	
	@RequestMapping("/addPayment")
	public PaymentEntity paymentadd(@RequestBody PaymentEntity payment) {
		pay.save(payment);
		return payment;
	}

}
