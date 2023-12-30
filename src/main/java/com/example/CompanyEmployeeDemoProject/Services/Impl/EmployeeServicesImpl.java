package com.example.CompanyEmployeeDemoProject.Services.Impl;

import com.example.CompanyEmployeeDemoProject.Repository.EmployeeRecordsRepository;
import com.example.CompanyEmployeeDemoProject.Repository.EmployeeRepository;
import com.example.CompanyEmployeeDemoProject.Services.EmployeeServices;
import com.example.CompanyEmployeeDemoProject.Model.Employee;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

   @Autowired
    private EmployeeRepository employeeRepository;
   @Autowired
    private EmployeeRecordsRepository employeeRecordsRepository;
    public  EmployeeServicesImpl(EmployeeRepository employeeRepository){
        super();
        this.employeeRepository = employeeRepository;

    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Data not found"));

    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {

        // we need to check whether employee with given id is existing in DB or not
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Data not found"));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        return this.employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(long id) {

        // check whether a employee exist in a DB or not
        employeeRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Data not found"));
        employeeRepository.deleteById(id);

    }
}
