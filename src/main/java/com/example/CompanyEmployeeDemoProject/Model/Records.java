package com.example.CompanyEmployeeDemoProject.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "records")
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Role Id")
    private Long roleId;

    @Column(name = "Designation")
    private String employeeDesignation;

    @Column(name = "Department")
    private String departmentName;

    @Column(name = "Salary")
    private float employeeSalary;

    @Column(name = "Address")
    private String address;

    @Column(name = "Work Experience")
    private float workExperience;


    public Records(String employeeDesignation, String departmentName,
                   float employeeSalary, String address, float workExperience) {
        this.employeeDesignation = employeeDesignation;
        this.departmentName = departmentName;
        this.employeeSalary = employeeSalary;
        this.address = address;
        this.workExperience = workExperience;
    }

    public Records() {               // default constructor
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(float workExperience) {
        this.workExperience = workExperience;
    }

    public String getId() {
        return null;
    }
}



