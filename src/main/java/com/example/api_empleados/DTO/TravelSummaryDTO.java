package com.example.api_empleados.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class TravelSummaryDTO {
    private String mes;
    private double totalMes;
    private String asume;

}
