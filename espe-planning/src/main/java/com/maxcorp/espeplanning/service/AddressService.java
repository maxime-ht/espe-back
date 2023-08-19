package com.maxcorp.espeplanning.service;

import com.maxcorp.espeplanning.dto.AddressDto;
import com.maxcorp.espeplanning.dto.EmployeeDto;

import java.util.Optional;

public interface AddressService {
    AddressDto add(AddressDto address);
    Optional<AddressDto> getById(Long id);
}
