/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ems.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Chetan
 */
@Entity
@Table(name = "tbl_employees")
public class Employee implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String adddress;
    @Column(name = "contact")
    private String contact;
    @Column (name = "email")
    private String email;
    @Column (name = "salary")
    private float salary;
    @Column (name = "status")
    private boolean status;
    
    

    public Employee() {
    }

    public Employee(long id, String name, String adddress, String contact, String email,float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.adddress = adddress;
        this.contact = contact;
        this.email = email;
        this.salary = salary;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", adddress=" + adddress + ", contact=" + contact + ", email=" + email + ", salary=" + salary + ", status=" + status + '}';
    }

    
}
