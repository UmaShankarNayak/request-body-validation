package com.webflux.validation.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDto {

    private String firstName;

    @NotNull(message = "{lastname.not.null}")
    private String lastName;

    @Min(value = 10, message = "{age.min.requirement}")
    @Max(value = 50, message = "{age.max.requirement}")
    private int age;

   /* @Pattern(regexp = "([a-z])+@([a-z])+\\.com", message = "{email.pattern.mismatch}")
    private String email;

    @NotNull(message = "{country.not.null}")
    private String country;

    private Integer ssn;*/

}