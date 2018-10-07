package com.minsoo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsoo.api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
