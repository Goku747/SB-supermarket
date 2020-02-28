package com.springboot.supermarket.UserEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String username;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@NotFound(action = NotFoundAction.IGNORE)
	private AddressEntity address;
	@OneToMany(cascade = CascadeType.ALL)
	@NotFound(action = NotFoundAction.IGNORE)
	private List<PaymentEntity> payment = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public List<PaymentEntity> getPayment() {
		return payment;
	}

	public void setPayment(List<PaymentEntity> payment) {
		this.payment = payment;
	}

}
