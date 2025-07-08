package com.example.api_empleados;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.api_empleados.DTO.TravelReportDTO;
import com.example.api_empleados.service.IExpensiveTravelService;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ExpensiveTravelServiceImplTest {

    @Autowired
    private IExpensiveTravelService service;

    @Test
    void testGetTravelReport_NotNull() {
        TravelReportDTO report = service.getReport();
        assertNotNull(report, "El reporte no debe ser null");
        assertNotNull(report.getResumenGastosPorEmpleado(), "La lista de empleados no debe ser null");
        assertTrue(report.getResumenGastosPorEmpleado().size() > 0, "Debe haber al menos un empleado en el reporte");
    }
}
