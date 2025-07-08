package com.example.api_empleados.repository;
import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.api_empleados.model.EmployeeEntity;

@Repository
public class EmployeeRepository {

    private ArrayList<EmployeeEntity> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
    }
    
}
