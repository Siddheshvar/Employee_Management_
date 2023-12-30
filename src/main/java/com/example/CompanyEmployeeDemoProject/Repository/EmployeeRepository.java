package com.example.CompanyEmployeeDemoProject.Repository;

import com.example.CompanyEmployeeDemoProject.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
