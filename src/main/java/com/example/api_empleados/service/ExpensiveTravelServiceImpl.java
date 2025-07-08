package com.example.api_empleados.service;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api_empleados.DTO.EmployeeDTO;
import com.example.api_empleados.DTO.TravelReportDTO;
import com.example.api_empleados.model.EmployeeEntity;
import com.example.api_empleados.repository.EmployeeRepository;

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
    public ArrayList<TravelReportDTO> getReport(){
        return null;
    }

}
