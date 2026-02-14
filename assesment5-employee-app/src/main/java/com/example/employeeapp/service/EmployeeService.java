package com.example.employeeapp.service;

import com.example.employeeapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    // GET ALL
    public Collection<Employee> getAllEmployees() {
        return employeeMap.values();
    }

    // GET BY ID
    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    // POST (SAVE)
    public Employee addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
        return employee;
    }

    // PUT (UPDATE except ID)
    public Employee updateEmployee(int id, Employee newEmployee) {
        Employee existing = employeeMap.get(id);
        if (existing != null) {
            existing.setEmployeeName(newEmployee.getEmployeeName());
            existing.setEmployeeEmail(newEmployee.getEmployeeEmail());
            existing.setLocation(newEmployee.getLocation());
        }
        return existing;
    }

    // DELETE
    public void deleteEmployee(int id) {
        employeeMap.remove(id);
    }
}
