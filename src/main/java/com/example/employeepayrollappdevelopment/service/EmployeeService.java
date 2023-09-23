package com.example.employeepayrollappdevelopment.service;

import com.example.employeepayrollappdevelopment.dto.EmployeeDto;
import com.example.employeepayrollappdevelopment.model.Employee;
import com.example.employeepayrollappdevelopment.repository.EmployeeRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
//    private List<Employee> empList =new ArrayList<>();
    @Autowired
    EmployeeRepo employeeRepo;
    public Employee addEmployee(EmployeeDto emp){
        Employee empobject = new Employee(emp);
//        empList.add(empobject);
        return employeeRepo.save(empobject);
    }
    public Employee getEmployee(int id){
        return employeeRepo.findById(id).orElse(null);
    }
//    public List<User> getEmployeeByFirstname(String empFirstname){
//        return greatingRepo.findByFirstname(empFirstname);
//    }
    public List<Employee> getAllEmployee(){
        List<Employee> emplist = employeeRepo.findAll();
        return emplist;
    }
    public Employee deleteEmployee(int id){
        employeeRepo.deleteById(id);
        return null;
    }
    public Employee updateEmployee(@NotNull EmployeeDto emp, int id){
        Employee empobject = new Employee(emp);
        empobject.setId(id);
        return employeeRepo.save(empobject);
    }

}

