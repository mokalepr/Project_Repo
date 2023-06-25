package com.registrationloginapp.demo.repository;

import com.registrationloginapp.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}

