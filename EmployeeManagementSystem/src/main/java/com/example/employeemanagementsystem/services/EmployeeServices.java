package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.dto.EmployeeDto;

import java.util.List;

public interface EmployeeServices {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);


}
