package com.maxcorp.espeplanning.entity;


import com.maxcorp.espeplanning.enumeration.Title;
import com.maxcorp.espeplanning.utils.RegexPatterns;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;


import java.sql.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Employee {

    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    private Long id;
    private String firstName;
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthday;
    private String phone;
    private Boolean car;

    @Pattern(regexp = RegexPatterns.EMAIL, message = "Invalid email format")
    private String mail;

    @Temporal(TemporalType.DATE)
    private Date hiring;

    @Enumerated(EnumType.STRING)
    private Title title;

    @ManyToOne(fetch=FetchType.LAZY)
    private Address address;

}
