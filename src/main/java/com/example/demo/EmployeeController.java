package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String employeeManagement(){
        return "employee_management";
    }

    @RequestMapping("/addemployee")
    public String addEmployee()
    {
        return "add_employee";
    }


    @PostMapping("/submission")
    public String addEmployee(@RequestParam("fname") String fname,
                                @RequestParam("lname") String lname,
                                @RequestParam("empdate") String empdate,
                                @RequestParam("departmentid") String departmentid,
                                @RequestParam("nicnumber") String nicnumber)
    {
        Employee employee = new Employee();
        employee.setFirstName(fname);
        employee.setLastName(lname);
        employee.setEmploymentDate(empdate);
        employee.setDepartmentId(departmentid);
        employee.setNicNumber(nicnumber);
        employeeService.addEmployee(employee);
        return "submission_successful";
    }

    @RequestMapping("/employee")
    public String viewEmployeeByName(Model model){
        List<String> employees = employeeService.viewEmployeeByName();
        model.addAttribute("employeeListByName",employees);
        return "view_employee_by_name";
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,
                                   @PathVariable("id") int employeeId){

        return employeeService.updateEmployee(employee, employeeId);
    }

    @RequestMapping("/deleteemployee")
    public String deleteEmployee(){
        return "delete_employee";
    }


    @PostMapping("/deleted")
    public String deleteEmployee(@RequestParam("employeeid") int employee_id){
        employeeService.deleteEmployee(employee_id);
        return "delete_successful";
    }

}
