package com.example.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private Long employeeId;

    private String employeeName;
    private String employeeEmail;
    private String location;

    public Employee() {}

    public Employee(Long employeeId, String employeeName, String employeeEmail, String location) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.location = location;
    }

    // Getters and Setters
    public Long getEmployeeId() { 
    	return employeeId; 
    }
    public void setEmployeeId(Long employeeId) { 
    	this.employeeId = employeeId; 
    }

    public String getEmployeeName() { 
    	return employeeName; 
    }
    public void setEmployeeName(String employeeName) { 
    	this.employeeName = employeeName; 
    }

    public String getEmployeeEmail() { 
    	return employeeEmail; 
    }
    public void setEmployeeEmail(String employeeEmail) { 
    	this.employeeEmail = employeeEmail; 
    }

    public String getLocation() { 
    	return location; 
    }
    public void setLocation(String location) { 
    	this.location = location; 
    }
}
