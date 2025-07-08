package com.example.api_empleados.model;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class EmployeeEntity {
    private String id;
    private String nombre;
    private ArrayList<TravelEntity> viajes;

    public void addTravel(TravelEntity travelEntity){
        this.viajes.add(travelEntity);
    }
}
