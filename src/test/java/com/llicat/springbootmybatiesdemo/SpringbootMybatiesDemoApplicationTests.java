package com.llicat.springbootmybatiesdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.llicat.entity.Department;
import com.llicat.entity.Employee;
import com.llicat.mapper.DepartmenetMapper;
import com.llicat.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatiesDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DepartmenetMapper departmenetMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void testMybatiesAnno() throws Exception{


//        Department department=new Department();
//        department.setDepartmentName("sale");
//
//        departmenetMapper.insertDept(department);

        ObjectMapper mapper = new ObjectMapper();


        System.out.println(mapper.writeValueAsString(departmenetMapper.getDeptById(1)));


    }


    @Test
    public void test() throws Exception{

        Employee employee=new Employee();
        employee.setLastName("tt");
        employeeMapper.insertEmp(employee);
    }




}
