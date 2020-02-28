package com.springboot.supermarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.supermarket.UserEntity.UserEntity;

@Repository
public interface UserInterface extends JpaRepository<UserEntity, Long> {
	public UserEntity findByUsername(String username);

	public void deleteByUsername(String username);

}
