package com.example.employeepayrollappdevelopment.controller;

import com.example.employeepayrollappdevelopment.dto.EmployeeDto;
import com.example.employeepayrollappdevelopment.dto.ResponseDto;
import com.example.employeepayrollappdevelopment.model.Employee;
import com.example.employeepayrollappdevelopment.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<ResponseDto> addEmployee(@Valid @RequestBody EmployeeDto emp){
        Employee employee = employeeService.addEmployee(emp);
        ResponseDto responseDto = new ResponseDto("New Employee Added successfully",employee);
        ResponseEntity<ResponseDto> response = new ResponseEntity<>(responseDto, HttpStatus.OK);
        return response;
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<ResponseDto> getEmployee(@Valid @PathVariable int id){
        Employee employee = employeeService.getEmployee(id);
        ResponseDto responseDto = new ResponseDto("Getting Employee successfully",employee);
        ResponseEntity<ResponseDto> response = new ResponseEntity<>(responseDto, HttpStatus.OK);
        return response;
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<ResponseDto> deleteEmployee(@Valid @PathVariable int id){
        Employee employee = employeeService.deleteEmployee(id);
        ResponseDto responseDto = new ResponseDto("Employee deleted successfully",employee);
        ResponseEntity<ResponseDto> response = new ResponseEntity<>(responseDto, HttpStatus.OK);
        return response;
    }

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<ResponseDto> updateEmployee(@Valid @PathVariable int id ,@RequestBody EmployeeDto emp){
        Employee employee = employeeService.updateEmployee(emp,id);
        ResponseDto responseDto = new ResponseDto(" Employee updated successfully",employee);
        ResponseEntity<ResponseDto> response = new ResponseEntity<>(responseDto, HttpStatus.OK);
        return response;
    }

//    @GetMapping("/getEmployeeByFirstname")
//    public List<Employee> getEmployeeByFirstname(@RequestParam String empFirstname){return employeeService.getEmployeeByFirstname(empFirstname);}

//    @GetMapping("/getAllEmployee")
//    public ResponseEntity<ResponseDto> getAllEmployee(){
//        Employee employee = (Employee) employeeService.getAllEmployee();
//        ResponseDto responseDto = new ResponseDto("Getting all Employee successfully",employee);
//        ResponseEntity<ResponseDto> response = new ResponseEntity<>(responseDto, HttpStatus.OK);
//        return response;
//    }


}
