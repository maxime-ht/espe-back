package com.maxcorp.espeplanning.controller;

import com.maxcorp.espeplanning.dto.EmployeeDto;
import com.maxcorp.espeplanning.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping()
    public List<EmployeeDto> employees() {
        return employeeService.findAll();
    }


    @PostMapping()
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.add(employeeDto);
        logger.info("employee created "+savedEmployee.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getByid(@PathVariable Long id) {
        Optional<EmployeeDto> searchedEmployee = employeeService.getById(id);
        logger.info("searched employee with id  "+id+ " : "+ searchedEmployee.toString());
        return searchedEmployee.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
