package com.maxcorp.espeplanning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_SEQ")
    private Long id;
    private String city;
    private String street;
    private String postalCode;
    private String additionalAddress;
    private String country;

}
