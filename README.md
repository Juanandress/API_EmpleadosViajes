# Prueba Técnica - Gestión y Reporte de Gastos de Viaje

## Descripción del Proyecto

Este proyecto es una **API REST** desarrollada con **Spring Boot** para la gestión y generación de reportes de gastos de viaje de empleados.

---

## Tecnologías Utilizadas

* **Java 17+**: Lenguaje de programación principal.
* **Spring Boot**: Framework para el desarrollo rápido de aplicaciones Java.
* **Lombok**: Librería para reducir el boilerplate code en Java.
* **JUnit 5**: Framework para la escritura y ejecución de pruebas unitarias.
* **Maven**: Herramienta de automatización de construcción y gestión de dependencias del proyecto.
* **Postman**: Herramienta utilizada para probar y documentar los endpoints de la API.

---

## Instrucciones de Ejecución

Sigue estos pasos para poner en marcha el proyecto localmente:

1.  **Clonar el Repositorio:**
    Abre tu terminal o línea de comandos y ejecuta el siguiente comando para clonar el proyecto:
    ```bash
    git clone [https://github.com/Juanandress/API_EmpleadosViajes.git](https://github.com/Juanandress/API_EmpleadosViajes.git)
    ```

2.  **Compilar el Proyecto:**
    Compila el código y descarga las dependencias necesarias con Maven:
    ```bash
    mvn clean install
    ```

3.  **Ejecutar la Aplicación:**
    Inicia la aplicación Spring Boot:
    ```bash
    mvn spring-boot:run
    ```
    Una vez que la aplicación se inicie, podrás acceder a los endpoints de la API, usualmente en `http://localhost:8080` (o el puerto configurado).

---

## Ejecución de Pruebas Unitarias

Para ejecutar las pruebas  del proyecto, utiliza el siguiente comando Maven:
mvn test