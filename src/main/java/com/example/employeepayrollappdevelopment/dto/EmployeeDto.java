package com.example.employeepayrollappdevelopment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmployeeDto {
    @NotEmpty(message="Employee cannot be NULL")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String empFirstname;
    public String empLastname;
    public long empPhone;
    @JsonFormat(pattern="dd mm yyyy")
    @NotNull(message = "startdate should not be empty")
    public String empStartDate;
    @NotEmpty(message="Department cannot be NULL")
    public String empDepartment;
    @Min(value=500,message = "minimum wages should be 500")
    public long empSalary;
    @NotBlank(message = "Note cannot be empty")
    public String empNote;
    @Pattern(regexp = "male|female",message = "gender should be male or female")
    @NotEmpty(message = "Gender should not be empty")
    public String empGender;
    @NotBlank(message = "ProfilePic cannot be empty")
    public String empProfilePic;

    public EmployeeDto(String empFirstname, String empLastname, long empPhone, String empStartDate, String empDepartment, long empSalary, String empNote, String empGender, String empProfilePic) {
        this.empFirstname = empFirstname;
        this.empLastname = empLastname;
        this.empPhone = empPhone;
        this.empStartDate = empStartDate;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
        this.empNote = empNote;
        this.empGender = empGender;
        this.empProfilePic = empProfilePic;
    }
}
