package com.fiberhome.dao;

import com.fiberhome.entity.Employee;

public interface EmployeeDao {
    Employee getEmployeeById(long id);

    Employee getEmployeeByUsername(String username);

    int addEmployee(Employee employee);

    int deleteEmployee(long employeeId);

    int updateEmployee(Employee employee);




}
