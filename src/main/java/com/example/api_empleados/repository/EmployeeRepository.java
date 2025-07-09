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
        EmployeeEntity employee1 = new EmployeeEntity("1", "Adam", new ArrayList<>());
        EmployeeEntity employee2 = new EmployeeEntity("2", "Bolton", new ArrayList<>());
        EmployeeEntity employee3 = new EmployeeEntity("3", "Chelsea", new ArrayList<>());
        EmployeeEntity employee4 = new EmployeeEntity("4", "Elsy", new ArrayList<>());
        EmployeeEntity employee5 = new EmployeeEntity("5", "Vicent", new ArrayList<>());
        EmployeeEntity employee6 = new EmployeeEntity("6", "Warden", new ArrayList<>());

        TravelEntity travel1 = new TravelEntity("1", LocalDate.parse("2021-01-01"), 2000000);
        TravelEntity travel2 = new TravelEntity("2", LocalDate.parse("2021-01-02"), 1000000);
        TravelEntity travel3 = new TravelEntity("3", LocalDate.parse("2021-01-01"), 400000);
        TravelEntity travel4 = new TravelEntity("4", LocalDate.parse("2021-01-02"), 900000);
        TravelEntity travel5 = new TravelEntity("6", LocalDate.parse("2021-02-03"), 1100000);
        TravelEntity travel6 = new TravelEntity("7", LocalDate.parse("2021-01-02"), 5100000);
        TravelEntity travel7 = new TravelEntity("8", LocalDate.parse("2021-01-02"), 4000000);
        TravelEntity travel8 = new TravelEntity("9", LocalDate.parse("2021-02-03"), 899999);
        TravelEntity travel9 = new TravelEntity("10", LocalDate.parse("2021-01-02"), 59999);
        TravelEntity travel10 = new TravelEntity("11", LocalDate.parse("2021-02-03"), 500000);
        TravelEntity travel11 = new TravelEntity("12", LocalDate.parse("2021-01-02"), 500000);
        TravelEntity travel12 = new TravelEntity("13", LocalDate.parse("2021-02-03"), 1100000);
        TravelEntity travel13 = new TravelEntity("5", LocalDate.parse("2021-02-03"), 1100000);

        this.employees.add(employee1);
        this.employees.add(employee2);
        this.employees.add(employee3);
         this.employees.add(employee4);
        this.employees.add(employee5);
        this.employees.add(employee6);

        employee1.addTravel(travel1);
        employee1.addTravel(travel2);
        employee2.addTravel(travel3);
        employee3.addTravel(travel4);
        employee2.addTravel(travel5);
        employee6.addTravel(travel6);
        employee4.addTravel(travel7);
        employee5.addTravel(travel8);  
        employee3.addTravel(travel9);
        employee1.addTravel(travel10);
        employee2.addTravel(travel11);
        employee6.addTravel(travel12);  
        employee3.addTravel(travel13);
       
    }
}
