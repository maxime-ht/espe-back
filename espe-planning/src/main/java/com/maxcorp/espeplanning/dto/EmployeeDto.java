package com.maxcorp.espeplanning.dto;

import com.maxcorp.espeplanning.enumeration.Title;
import lombok.*;


import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String phone;
    private String mail;
    private Boolean car;
    private Date hiring;
    private Title title;
    private AddressDto address;

}
