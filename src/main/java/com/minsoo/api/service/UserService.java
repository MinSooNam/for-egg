package com.minsoo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.minsoo.api.model.User;
import com.minsoo.api.repository.UserRepository;

@Service
public class UserService extends DomainEntityService<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    protected JpaRepository<User, Long> repository() {
        return userRepository;
    }
}
