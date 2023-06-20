package com.management.employee.controller;

import com.management.employee.entity.Employee;
import com.management.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    Employee emp;
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("allEmp",service.getAll());
        model.addAttribute("emp",new Employee());
        return "index";
    }
    @PostMapping("saveOrUpdate")
    public  String saveOrUpdate(@ModelAttribute("emp") Employee emp){
        service.createOrUpdate(emp);
        return "redirect:/";
    }
}
