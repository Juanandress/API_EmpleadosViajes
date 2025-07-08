package com.example.api_empleados.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api_empleados.DTO.EmployeeDTO;
import com.example.api_empleados.DTO.EmployeeTravelSummaryDTO;
import com.example.api_empleados.DTO.TravelReportDTO;
import com.example.api_empleados.model.EmployeeEntity;
import com.example.api_empleados.model.TravelEntity;
import com.example.api_empleados.repository.EmployeeRepository;
import com.example.api_empleados.DTO.TravelSummaryDTO;

@Service
public class ExpensiveTravelServiceImpl implements IExpensiveTravelService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ArrayList<EmployeeDTO> getEmployees() {
        ArrayList<EmployeeEntity> employees = employeeRepository.findAll();
        ArrayList<EmployeeDTO> employeesDTOs = new ArrayList<>();
        for (EmployeeEntity entity : employees) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(entity.getId());
            employeeDTO.setNombre(entity.getNombre());
            employeesDTOs.add(employeeDTO);
        }
        return employeesDTOs;

    }

    @Override
    public TravelReportDTO getReport(){
        double IVA = 0.19;
        double totalGastosEmpleados = 0;
        ArrayList<EmployeeEntity> employees = employeeRepository.findAll();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};


        ArrayList<EmployeeTravelSummaryDTO> empleadosResumen = new ArrayList<>();
        for(EmployeeEntity empleado : employees){
            Map<String, Double> gastosPorMes = new HashMap<>();
            if(empleado.getViajes() != null) {
                for (TravelEntity viaje : empleado.getViajes()) {
                    String mesNombre = meses[viaje.getFechaViaje().getMonthValue()-1];
                    double totalGasto = viaje.getTotalGasto() * (1 + IVA);
                    gastosPorMes.put(mesNombre, gastosPorMes.getOrDefault(mesNombre, 0.0) + totalGasto);
                    totalGastosEmpleados += totalGasto;
                }
            }
            double totalGastosEmpleado = gastosPorMes.values().stream().mapToDouble(Double::doubleValue).sum();
            totalGastosEmpleados += totalGastosEmpleados;
            ArrayList<TravelSummaryDTO> resumenGastosPorMes = new ArrayList<>();
            for (Map.Entry<String, Double> entry : gastosPorMes.entrySet()) {
                String asume = entry.getValue() > 1000000 ? "SURA" : "Empleado";
                resumenGastosPorMes.add(new TravelSummaryDTO(entry.getKey(), entry.getValue(), asume));
            }
            empleadosResumen.add(new EmployeeTravelSummaryDTO(empleado.getNombre(), totalGastosEmpleado, resumenGastosPorMes));    
        }
        return new TravelReportDTO(totalGastosEmpleados, empleadosResumen);
    }

}
