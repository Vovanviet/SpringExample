package com.management.employee.service;

import com.management.employee.entity.Employee;
import com.management.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;
    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Long createOrUpdate(Employee employee) {
        repository.save(employee);
        return employee.getId();
    }
}
