package com.example.api_empleados.DTO;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class EmployeeTravelSummaryDTO {
    private String nombre;
    private double totalGastos;
    private ArrayList<TravelSummaryDTO> gastoPorMes;
}
