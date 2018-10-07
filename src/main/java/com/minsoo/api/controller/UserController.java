package com.minsoo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minsoo.api.controller.converter.UserToV1UserConverter;
import com.minsoo.api.controller.resource.V1User;
import com.minsoo.api.model.User;
import com.minsoo.api.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserToV1UserConverter userToV1UserConverter;

    @GetMapping("/{id}")
    public V1User get(@PathVariable Long id) {
        return userToV1UserConverter.convert(userService.get(id));
    }

    @PostMapping
    public V1User create(@RequestBody V1User resource) {
        User user = userService.create(userToV1UserConverter.convertToEntity(resource));
        return userToV1UserConverter.convert(user);
    }

    @DeleteMapping("{id}")
    public void remove(@PathVariable Long id) {
        userService.remove(id);
    }
}
