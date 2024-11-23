package com.example.Spring_boot_API.controllers;


import com.example.Spring_boot_API.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

@RestController

public class EmployeeController {

   @GetMapping(path = "/employees")

   public String getWelcomeMessage() {

      return "Welcome to the Employee API!";

   }


   @GetMapping(path = "/employees/{id}")

   public String getEmployeeById(@PathVariable int id) {

      return "Employee with ID " + id + " retrieved successfully!";
   }


   @GetMapping(path = "/employeess")

   public String getAllEmployees(@RequestParam Integer age,
                                 @RequestParam String name,
                                 @RequestParam String department)
   {

      return "All employees retrieved successfully!" + age + " " + name + " " + department;


   }


   @PostMapping(path = "/employ")

   public String addEmployee() {

      return "Employee added successfully!";

   }

   @PutMapping (path = "/emm")
   String update(){
      return "Employee updated successfully!";
   }

   @DeleteMapping (path = "/emp")
   String delete(){
      return "Employee deleted successfully!";
   }


   @PostMapping(path = "/some")

   public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee) {
      employee.setId(100l);
      return employee;
   }





}
