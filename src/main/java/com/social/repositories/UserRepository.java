package com.social.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
