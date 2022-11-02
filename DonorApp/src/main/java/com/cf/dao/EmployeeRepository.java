package com.cf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cf.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
