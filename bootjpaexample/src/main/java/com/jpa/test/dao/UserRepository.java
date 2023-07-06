package com.jpa.test.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.user;

public interface UserRepository extends CrudRepository<User, Integer> {

	user save(user user);

}
