package com.example.api_empleados.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.api_empleados.DTO.EmployeeDTO;
import com.example.api_empleados.service.IExpensiveTravelService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class TravelEmployeeController {
    @Autowired
    private IExpensiveTravelService expensiveTravelService;

    @GetMapping("/employees")
    public ArrayList<EmployeeDTO> getEmployees(){
        return expensiveTravelService.getEmployees();
    }
}
