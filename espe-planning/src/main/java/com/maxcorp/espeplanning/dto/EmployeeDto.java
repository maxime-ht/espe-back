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
public class EmployeeDto extends PersonDto{

    private Long id;
    private String phone;
    private String mail;
    private Boolean car;
    private Date hiring;
    private Title title;

}
