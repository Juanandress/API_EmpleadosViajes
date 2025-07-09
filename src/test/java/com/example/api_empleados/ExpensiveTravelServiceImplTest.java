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

    @Test
    void testEmpleadosOrdenadosAlfabeticamente() {
        TravelReportDTO report = service.getReport();
        for (int i = 1; i < report.getResumenGastosPorEmpleado().size(); i++) {
            String antes = report.getResumenGastosPorEmpleado().get(i-1).getNombre();
            String actual = report.getResumenGastosPorEmpleado().get(i).getNombre();
            assertTrue(antes.compareToIgnoreCase(actual) <= 0, "Los empleados deben estar ordenados alfabéticamente por nombre");
        }
    }
    
    @Test
    void testLogicaQuienAsumeGasto() {
        TravelReportDTO report = service.getReport();
        report.getResumenGastosPorEmpleado().forEach(empleado -> {
            empleado.getGastoPorMes().forEach(gasto -> {
                if (gasto.getTotalMes() > 1000000) {
                    assertEquals("SURA", gasto.getAsume(), "El gasto mayor a 1,000,000 debe ser asumido por SURA");
                } else {
                    assertEquals("Empleado", gasto.getAsume(), "El gasto menor o igual a 1,000,000 debe ser asumido por el Empleado");
                }
            });
        });
    }

}
