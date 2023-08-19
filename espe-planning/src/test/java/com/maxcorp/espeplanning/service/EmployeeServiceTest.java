package com.maxcorp.espeplanning.service;

import com.maxcorp.espeplanning.dao.EmployeeRepository;
import com.maxcorp.espeplanning.dto.EmployeeDto;
import com.maxcorp.espeplanning.entity.Employee;
import com.maxcorp.espeplanning.service.impl.EmployeeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private ModelMapper modelMapper;


    @Test
    public void testCreateEmployee() {

        // Créez une instance fictive d'Employee que vous souhaitez créer
//        EmployeeDto employeeDto = new EmployeeDto();
//        employeeDto.setFirstName("John");
//        employeeDto.setLastName("Doe");
//        employeeDto.setId(123);
//        Employee employee = new Employee();
//        employee.setFirstName("John");
//        employee.setLastName("Doe");
//        employee.setId(123);
//
//        // Configurez le comportement simulé de EmployeeRepository.save()
//        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);
//
//        // Appelez la méthode du service à tester
//        EmployeeDto createdEmployee = employeeService.add(employeeDto);
//
//        // Vérifiez que la méthode save a été appelée avec le bon argument
//        verify(employeeRepository, times(1)).save(employee);
//
//        // Vérifiez le résultat
//        assertNotNull(createdEmployee);
//        assertEquals("John", createdEmployee.getFirstName());
//        assertEquals("Doe", createdEmployee.getLastName());
    }

}
