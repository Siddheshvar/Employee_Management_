package com.example.CompanyEmployeeDemoProject.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Employees")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private long Contact;

//    @ManyToOne
//    Records records;



}

