package com.minsoo.api.model;

import javax.persistence.Entity;

import com.minsoo.api.model.common.DomainEntity;
import com.minsoo.api.model.common.Gender;
import com.minsoo.api.model.common.SignUpType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@Entity
@NoArgsConstructor
public class User extends DomainEntity {

    @NonNull
    private String name;

    private Gender gender;

    private Integer age;

    @NonNull
    private String email;

    private String phoneNumber;

    @NonNull
    private SignUpType signUpType;
}