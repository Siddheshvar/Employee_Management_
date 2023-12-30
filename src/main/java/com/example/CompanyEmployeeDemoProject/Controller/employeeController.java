package com.example.CompanyEmployeeDemoProject.Controller;

import com.example.CompanyEmployeeDemoProject.Services.EmployeeServices;
import com.example.CompanyEmployeeDemoProject.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class employeeController {

    @Autowired
    private EmployeeServices employeeServices;
    public  employeeController(EmployeeServices employeeServices){
        super();
        this.employeeServices = employeeServices;
    }

    // create employee REST API 

    @PostMapping("/save")                                         // ✅
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(this.employeeServices.saveEmployee(employee), HttpStatus.OK);
    }

    // build get all employees REST API
    @GetMapping("/getemployees")                                  // ✅
    public List<Employee> getAllEmployee(){
        return employeeServices.getAllEmployees();
    }


    //biuld get employee by id
    @GetMapping("/get/{id}")                                           // ✅
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
        return new ResponseEntity<Employee>(employeeServices.getEmployeeById(employeeId),HttpStatus.OK);

    }

    @PutMapping("/put{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable("id") long employeeId,
                                                       @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeServices.updateEmployee(employee,employeeId),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")                                        // ✅
    public ResponseEntity<Employee> deleteEmployeeById(@PathVariable("id") long id){
        // delete employee from DB
        employeeServices.deleteEmployee(id);
        return new ResponseEntity<Employee>(HttpStatus.OK);

    }


}

