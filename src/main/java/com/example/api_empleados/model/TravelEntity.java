package com.example.api_empleados.model;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class TravelEntity {
    private String idViaje;
    private LocalDate fechaViaje;
    private double totalGasto;
}
