package com.example.api_empleados.DTO;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class TravelDTO {
    private String idViaje;
    private LocalDate fechaViaje;
    private double totalGasto;
}
