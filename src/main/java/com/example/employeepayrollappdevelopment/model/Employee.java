package com.example.employeepayrollappdevelopment.model;

import com.example.employeepayrollappdevelopment.dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String empFirstname;
    private String empLastname;
    private long empPhone;
    private String empStartDate;
    private String empDepartment;
    private long empSalary;
    private String empNote;
    private String empGender;
    private String empProfilePic;

    public  Employee( EmployeeDto employeeDto) {    //Save

        this.empFirstname = employeeDto.empFirstname;
        this.empLastname = employeeDto.empLastname;
        this.empPhone = employeeDto.empPhone;
        this.empSalary = employeeDto.empSalary;
        this.empGender = employeeDto.empGender;
        this.empStartDate = employeeDto.empStartDate;
        this.empNote = employeeDto.empNote;
        this.empProfilePic = employeeDto.empProfilePic;
        this.empDepartment = employeeDto.empDepartment;
    }
    public  Employee(int id, EmployeeDto employeeDto) {    //Update
        this.Id=id;
        this.empFirstname = employeeDto.empFirstname;
        this.empLastname = employeeDto.empLastname;
        this.empPhone = employeeDto.empPhone;
        this.empSalary = employeeDto.empSalary;
        this.empGender = employeeDto.empGender;
        this.empStartDate = employeeDto.empStartDate;
        this.empNote = employeeDto.empNote;
        this.empProfilePic = employeeDto.empProfilePic;
        this.empDepartment = employeeDto.empDepartment;
    }

}
