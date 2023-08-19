package com.maxcorp.espeplanning.service.impl;

import com.maxcorp.espeplanning.dao.EmployeeRepository;
import com.maxcorp.espeplanning.dto.AddressDto;
import com.maxcorp.espeplanning.dto.EmployeeDto;
import com.maxcorp.espeplanning.entity.Address;
import com.maxcorp.espeplanning.entity.Employee;
import com.maxcorp.espeplanning.service.AddressService;
import com.maxcorp.espeplanning.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;
    private final AddressService addressService;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper, AddressService addressService) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
        this.addressService = addressService;
    }

    @Override
    public List<EmployeeDto> findAll() {
        return this.employeeRepository.findAll()
                .stream()
                .map(e -> this.modelMapper.map(e, EmployeeDto.class))
                .collect(Collectors.toList());
    }


    @Override
    public EmployeeDto add(EmployeeDto employeeDto) {

        AddressDto addressDto = employeeDto.getAddress();
        AddressDto addressDtoSaved = addressService.add(addressDto);

        employeeDto.setAddress(addressDtoSaved);
        Employee employeeToSave = this.modelMapper.map(employeeDto, Employee.class);
        Employee savedEmployee= employeeRepository.save(employeeToSave);

        return modelMapper.map(savedEmployee, EmployeeDto.class);

    }


    @Override
    public Optional<EmployeeDto> getById(Long id) {
        Optional<Employee> employee = this.employeeRepository.findById(id);
        Optional<EmployeeDto> result = Optional.empty();

        if (employee.isPresent()) {
            Employee e = employee.get();
            EmployeeDto dto = this.modelMapper.map(e, EmployeeDto.class);
            result = Optional.of(dto);
        }
        return result;
    }
}
