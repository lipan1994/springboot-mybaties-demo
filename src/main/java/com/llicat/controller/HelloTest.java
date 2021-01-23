package com.llicat.controller;

import com.llicat.entity.Department;
import com.llicat.entity.Employee;
import com.llicat.mapper.DepartmenetMapper;
import com.llicat.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lipan
 * @date: 2021/1/22 21:59
 */

@Controller
public class HelloTest {


    @Autowired
    DepartmenetMapper departmenetMapper;


    @Autowired
    EmployeeMapper employeeMapper;

    @ResponseBody
    @RequestMapping("/test")
    public Department hello(){
        Department dept = departmenetMapper.getDeptById(1);
        return  dept;
    }

    @ResponseBody
    @RequestMapping("/insert")
    public Employee set(){
//        Employee employee=new Employee();
//        employee.setLastName("cc");
//       employeeMapper.insertEmp(employee);
//       return "suceess";
       return employeeMapper.getEmpById(1);
    }

}
