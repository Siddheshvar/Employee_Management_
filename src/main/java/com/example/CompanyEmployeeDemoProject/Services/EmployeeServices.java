package com.example.CompanyEmployeeDemoProject.Services;
import com.example.CompanyEmployeeDemoProject.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServices {
    Employee saveEmployee(Employee employee);
    List<Employee>getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
}
