package com.management.employee.service;

import com.management.employee.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();
    Long createOrUpdate(Employee employee);
}
