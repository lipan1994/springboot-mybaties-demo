package com.llicat.mapper;


import com.llicat.entity.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
