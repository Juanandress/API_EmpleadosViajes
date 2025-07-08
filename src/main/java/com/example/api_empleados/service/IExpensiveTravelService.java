package com.example.api_empleados.service;
import java.util.ArrayList;
import com.example.api_empleados.DTO.EmployeeDTO;
import com.example.api_empleados.DTO.TravelSummaryDTO;

public interface IExpensiveTravelService {
    public ArrayList<EmployeeDTO> getEmployees();
    public ArrayList<TravelSummaryDTO> getSummary();
}
