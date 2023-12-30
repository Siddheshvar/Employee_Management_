package com.example.CompanyEmployeeDemoProject.Repository;

import com.example.CompanyEmployeeDemoProject.Model.Records;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRecordsRepository extends JpaRepository<Records,String> {

}
