package com.springboot.supermarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.supermarket.UserEntity.PaymentEntity;

@Repository
public interface PaymentInterface extends JpaRepository<PaymentEntity, Long>{
	

}
