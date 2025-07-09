package com.example.api_empleados.DTO;
import java.util.*;
import com.example.api_empleados.model.TravelEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class EmployeeDTO {
    private String id;
    private String nombre;
    private ArrayList<TravelEntity> viajes;
    
}
