package com.example.employeemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    //Attributes of employees
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String jobTitle;
    private String department;
    private String phone;
    private String imageUrl;
    
    //Getters and Setters
    //Use Lombok to simplify, but for practice I'm writing these on my own
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    //Constructors
    public Employee(){
    }
    public Employee(String name, String email, String jobTitle, String department, String phone, String imageUrl){
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.department = department;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }
}
