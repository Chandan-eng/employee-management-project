package com.nagarro.Employeapp.service;

import com.nagarro.Employeapp.entity.Employee;
import com.nagarro.Employeapp.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public void addEmp(Employee e) {
        repo.save(e);
    }

    public List<Employee> getAllEmp() {
        return repo.findAll();
    }

    public Employee getEMpById(int id) {
        Optional<Employee> e = repo.findById(id);
        if (e.isPresent()) {
            return e.get();
        }
        return null;
    }

    public void deleteEMp(int id) {
        repo.deleteById(id);
    }

    public Page<Employee> getEMpByPaginate(int currentPage, int size) {
        Pageable p = PageRequest.of(currentPage, size);
        return repo.findAll(p);
    }

}
