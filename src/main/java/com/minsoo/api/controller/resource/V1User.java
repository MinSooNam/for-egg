package com.minsoo.api.controller.resource;

import java.time.OffsetDateTime;

import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

import com.minsoo.api.model.common.Gender;
import com.minsoo.api.model.common.SignUpType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class V1User {

    @Null
    private Long id;

    @NonNull
    private String name;

    private Gender gender;

    private Integer age;

    @NonNull
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")
    private String email;

    private String phoneNumber;

    @NonNull
    private SignUpType signUpType;

    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime modifiedDate;
    @Null
    private OffsetDateTime removedDate;
}
