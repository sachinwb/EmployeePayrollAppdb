package com.example.employeepayrollappdevelopment.repository;

import com.example.employeepayrollappdevelopment.dto.EmployeeDto;
import com.example.employeepayrollappdevelopment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
//    List<Employee> findByFirstname(String empFirstname);
}
