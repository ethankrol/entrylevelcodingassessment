package com.challenge.api.service;
import com.challenge.api.model.Employee;

import java.util.UUID;

import java.time.Instant;

import org.springframework.stereotype.Service;

// Could also probably use a java record here
@Service
public class EmployeeImpl implements Employee {
    private UUID uuid;
    private String firstName;
    private String lastName;
    // Assuming here that fullName is a separate field, otherwise have to do string splitting to get first and last names.
    private String fullName;
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant contractHireDate;
    private Instant contractTerminationDate;

    public EmployeeImpl(){
    }

    public EmployeeImpl(UUID uuid, String firstName, String lastName, String fullName, Integer salary, Integer age, String jobTitle, String email, Instant contractHireDate, Instant contractTerminationDate){
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.salary = salary;
        this.age = age;
        this.jobTitle = jobTitle;
        this.email = email;
        this.contractHireDate = contractHireDate;
        this.contractTerminationDate = contractTerminationDate;
    }

    @Override
    public UUID getUuid(){
        return this.uuid;
    }

    @Override
    public void setUuid(UUID uuid){
        this.uuid = uuid;
    }

    @Override
    public String getFirstName(){
        return this.firstName;
    }

    @Override
    public void setFirstName(String name){
        this.firstName = name;
    }

    @Override
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public void setLastName(String name){
        this.lastName = name;
    }

    @Override
    public String getFullName(){
        return this.fullName;
    }

    @Override
    public void setFullName(String name){
        this.fullName = name;
    }

    @Override
    public Integer getSalary(){
        return this.salary;
    }

    @Override
    public void setSalary(Integer salary){
        this.salary = salary;
    }

    @Override
    public Integer getAge(){
        return this.age;
    }

    @Override
    public void setAge(Integer age){
        this.age = age;
    }

    @Override
    public String getJobTitle(){
        return this.jobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    @Override
    public String getEmail(){
        return this.email;
    }

    @Override
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public Instant getContractHireDate(){
        return this.contractHireDate;
    }

    @Override
    public void setContractHireDate(Instant date){
        this.contractHireDate = date;
    }

    /**
     * Nullable.
     * @return null, if Employee has not been terminated.
     */
    public Instant getContractTerminationDate(){
        return this.contractTerminationDate;
    }

    public void setContractTerminationDate(Instant date){
        this.contractTerminationDate = date;
    }
}
