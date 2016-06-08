/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ems.dao.impl;

import com.leapfrog.ems.dao.EmployeeDAO;
import com.leapfrog.ems.entity.Employee;
import com.leapfrog.ems.util.HibernateUtil;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chetan
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    
    @Autowired
    private HibernateUtil hibernateUtil;
    
    @Override
    public long createEmployee(Employee employee) {
        return (long) hibernateUtil.create(employee);
    }
    
    @Override
    public Employee updateEmployee(Employee employee) {
        return hibernateUtil.update(employee);
    }
    
    @Override
    public void deleteEmployee(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        hibernateUtil.delete(employee);
    }
    
    @Override
    public List<Employee> getAllEmployees() {
        return hibernateUtil.fetchAll(Employee.class);
    }
    
    @Override
    public Employee getEmployee(long id) {
        return hibernateUtil.fetchById(id, Employee.class);
    }
    
//    @SuppressWarnings("unchecked")
//    @Override
    public List<Employee> getAllEmployees(String employeeName) {
        return null;
//        
//        String query = "SELECT e.* FROM Employees e WHERE e.name like '%" + employeeName + "%'";
//        List<Object[]> employeeObjects = hibernateUtil.fetchAll(query);
//        List<Employee> employees = new ArrayList<Employee>();
//        for (Object[] employeeObject : employeeObjects) {
//            Employee employee = new Employee();
//            long id = ((BigInteger) employeeObject[0]).longValue();
////            int age = (int) employeeObject[1];
//            String name = (String) employeeObject[1];
//            String address = (String) employeeObject[2];
//            String contact = (String) employeeObject[3];
//            String email = (String) employeeObject[4];
//            float salary = (float) employeeObject[5];
//            Boolean status = (Boolean) employeeObject[6];
//            employee.setId(id);
//            employee.setName(name);
//            employee.setAdddress(address);
//            employee.setContact(contact);
//            employee.setEmail(email);
//            employee.setSalary(salary);
//            employee.setStatus(true);
//            employees.add(employee);
//        }
//        System.out.println(employees);
//        return employees;
   }
    
}
