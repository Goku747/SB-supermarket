package com.springboot.supermarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.supermarket.UserEntity.AddressEntity;

@Repository
public interface AddressInterface extends JpaRepository<AddressEntity, Long>{

}
