package com.example.api_empleados.repository;
import java.time.LocalDate;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.example.api_empleados.model.EmployeeEntity;
import com.example.api_empleados.model.TravelEntity;

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

        TravelEntity travel1 = new TravelEntity("1", LocalDate.parse("2021-01-01"), 2000000);
        TravelEntity travel2 = new TravelEntity("2", LocalDate.parse("2021-02-02"), 1000000);
        TravelEntity travel3 = new TravelEntity("3", LocalDate.parse("2021-01-01"), 400000);
        TravelEntity travel4 = new TravelEntity("4", LocalDate.parse("2021-01-02"), 900000);

        this.employees.add(employee1);
        this.employees.add(employee2);
        this.employees.add(employee3);

        employee1.addTravel(travel1);
        employee1.addTravel(travel2);
        employee2.addTravel(travel3);
        employee3.addTravel(travel4);      
    }
}
