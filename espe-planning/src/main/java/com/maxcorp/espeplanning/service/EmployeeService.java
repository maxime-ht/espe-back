package com.maxcorp.espeplanning.service;

import com.maxcorp.espeplanning.dto.EmployeeDto;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

List<EmployeeDto> findAll();
EmployeeDto add(EmployeeDto employee);
Optional<EmployeeDto> getById(Long id);

}
