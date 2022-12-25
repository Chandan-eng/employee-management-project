package com.nagarro.Employeapp.repo;

import com.nagarro.Employeapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}
