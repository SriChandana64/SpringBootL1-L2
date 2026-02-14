package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    // Landing page (Form)
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    // Save employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee) {
        repository.save(employee);
        return "redirect:/displayAll";
    }

    // Display all employees
    @GetMapping("/displayAll")
    public String displayAll(Model model) {
        model.addAttribute("employees", repository.findAll());
        return "displayAll";
    }

    // Display one employee by ID
    @GetMapping("/display/{id}")
    public String displayById(@PathVariable("id") Long id, Model model) {
        Employee employee = repository.findById(id).orElse(null);
        model.addAttribute("employee", employee);
        return "displayOne";
    }
}
