package com.minsoo.api.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.minsoo.api.controller.resource.V1User;
import com.minsoo.api.model.User;

@Component
public class UserToV1UserConverter implements Converter<User, V1User> {
    @Override
    public V1User convert(User entity) {
        return new V1User().setId(entity.getId())
                           .setAge(entity.getAge())
                           .setEmail(entity.getEmail())
                           .setGender(entity.getGender())
                           .setName(entity.getName())
                           .setPhoneNumber(entity.getPhoneNumber())
                           .setSignUpType(entity.getSignUpType())
                           .setCreatedDate(entity.getCreatedDate())
                           .setModifiedDate(entity.getModifiedDate());
    }

    public User convertToEntity(V1User resource) {
        return new User().setAge(resource.getAge())
                         .setEmail(resource.getEmail())
                         .setGender(resource.getGender())
                         .setName(resource.getName())
                         .setPhoneNumber(resource.getPhoneNumber())
                         .setSignUpType(resource.getSignUpType());
    }
}
