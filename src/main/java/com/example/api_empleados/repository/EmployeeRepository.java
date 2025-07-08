package com.example.api_empleados.repository;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.example.api_empleados.model.EmployeeEntity;

@Repository
public class EmployeeRepository {

    private ArrayList<EmployeeEntity> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
        loadEmployees();
    }

    public ArrayList<EmployeeEntity> findAll() {
        return this.employees;
    }
    
    public void loadEmployees(){
        EmployeeEntity employee1 = new EmployeeEntity("1", "Juan Perez", new ArrayList<>());
        EmployeeEntity employee2 = new EmployeeEntity("2", "Maria Lopez", new ArrayList<>());
        EmployeeEntity employee3 = new EmployeeEntity("3", "Carlos Garcia", new ArrayList<>());

        this.employees.add(employee1);
        this.employees.add(employee2);
        this.employees.add(employee3);
    }
}
