/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ems.dao;

import com.leapfrog.ems.entity.Employee;
import java.util.List;

/**
 *
 * @author Chetan
 */
public interface EmployeeDAO {

    public long createEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long id);

    public List<Employee> getAllEmployees();

    public Employee getEmployee(long id);

    public List<Employee> getAllEmployees(String employeeName);
}
