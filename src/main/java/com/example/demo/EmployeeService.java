package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //nicStartsWith
    //employeeWorkYears

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<String> viewEmployeeByName() {
        List<Employee> allData = new ArrayList<>();
        employeeRepository.findAll().forEach(allData::add);
        List<String> allEmployeesByName = new ArrayList<>();
        for(int i=0;i<allData.size();i++){
            String employeeFullName = allData.get(i).getFirstName()+ " " + allData.get(i).getLastName();
           allEmployeesByName.add(i,employeeFullName);
        }
        return allEmployeesByName;
    }

    //getEmployeesByDepartmentName

    public Employee updateEmployee(Employee employee, int employeeId){

        Employee sampleEmployee = employeeRepository.findById(employeeId).get();
        sampleEmployee.setFirstName(employee.getFirstName());
        sampleEmployee.setLastName(employee.getLastName());
        sampleEmployee.setEmploymentDate(employee.getEmploymentDate());
        sampleEmployee.setDepartmentId(employee.getDepartmentId());
        sampleEmployee.setNicNumber(employee.getNicNumber());

        return employeeRepository.save(sampleEmployee);
    }

    public void deleteEmployee(Integer employee_id){
        employeeRepository.deleteById(employee_id);
    }

}
