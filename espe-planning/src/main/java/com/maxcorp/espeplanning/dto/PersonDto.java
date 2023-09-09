package com.maxcorp.espeplanning.dto;
import com.maxcorp.espeplanning.enumeration.Gender;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonDto {

    private String firstName;
    private String lastName;
    private Date birthday;
    private AddressDto address;
    private Gender gender;

}
