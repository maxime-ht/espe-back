package com.maxcorp.espeplanning.entity;


import com.maxcorp.espeplanning.enumeration.Title;
import com.maxcorp.espeplanning.utils.RegexPatterns;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.sql.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Employee extends Person {

    @NotNull(message = "Phone number must not be null")
    private String phone;

    @NotNull
    private Boolean car;

    @Pattern(regexp = RegexPatterns.EMAIL, message = "Invalid email format")
    @Nullable
    private String mail;

    @Temporal(TemporalType.DATE)
    @Nullable
    private Date hiring;

    @Nullable
    @OneToMany(fetch= FetchType.LAZY)
    private Set<Child> children;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Title title;

}
