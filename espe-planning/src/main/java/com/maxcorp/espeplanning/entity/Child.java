package com.maxcorp.espeplanning.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Child extends Person{

@Nullable
@ManyToOne
private Employee employeeReferer;


@Nullable
@Temporal(TemporalType.DATE)
private Date arrivalDate;

@Nullable
@Temporal(TemporalType.DATE)
private Date departureDate;



}
