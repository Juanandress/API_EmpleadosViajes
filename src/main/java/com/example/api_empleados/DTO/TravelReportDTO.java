package com.example.api_empleados.DTO;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class TravelReportDTO {
    private double totalGastosEmpleados;
    private ArrayList<EmployeeTravelSummaryDTO> resumenGastosPorEmpleado;
}
