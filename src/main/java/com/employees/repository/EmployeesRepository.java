package com.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.entity.Employees;

public interface EmployeesRepository  extends JpaRepository<Employees,Integer> {

}
