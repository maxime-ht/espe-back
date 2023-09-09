package com.maxcorp.espeplanning.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class AddressDto {

    private Long id;
    private String city;
    private String street;
    private String zipCode;
    private String additionalAddress;
    private String country;
}
