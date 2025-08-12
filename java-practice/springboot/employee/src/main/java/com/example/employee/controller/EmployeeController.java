package com.example.employee.controller;

import com.example.employee.EmployeeApplication;
import com.example.employee.model.Employee;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  ConfigurableApplicationContext applicationContext =
    EmployeeApplication.getData();

  @GetMapping("/employees")
  public ResponseEntity<Map<String, Object>> getAllEmployees() {
    Map<String, Employee> employees = applicationContext.getBeansOfType(
      Employee.class
    );

    if (!employees.isEmpty()) {
      return ResponseEntity.ok().body(Map.of("employees", employees.values()));
    }

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
      Map.of("err", "No data found")
    );
  }

  @GetMapping("/employee/{id}")
  public Map<String, Object> getEmployee(@PathVariable long id) {
    Map<String, Employee> employees = applicationContext.getBeansOfType(
      Employee.class
    );
    ArrayList<Employee> employeesData = new ArrayList<Employee>(
      employees.values()
    );

    return employeesData
      .stream()
      .filter(e -> e.getId() == id)
      .findFirst()
      .map(e -> Map.<String, Object>of("Employee", e))
      .orElse(Map.of("err", "No data found!"));
  }
}
