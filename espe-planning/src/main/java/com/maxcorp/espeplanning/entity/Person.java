package com.maxcorp.espeplanning.entity;

import com.maxcorp.espeplanning.enumeration.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.sql.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSON_SEQ")
    @SequenceGenerator(name = "PERSON_SEQ", sequenceName = "person_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @ManyToOne(fetch= FetchType.LAZY)
    private Address address;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Gender gender;
}
