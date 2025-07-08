package com.example.api_empleados.model;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class EmployeeEntity {
    private String id;
    private String nombre;
    private List<TravelEntity> viajes;
}
