package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<String> viewEmployeeByName(){
        return employeeService.viewEmployeeByName();
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,
                                   @PathVariable("id") int employeeId){

        return employeeService.updateEmployee(employee, employeeId);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") int employee_id){
        employeeService.deleteEmployee(employee_id);
        return "Deleted Successfully";
    }

}
