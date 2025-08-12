package com.example.employee.controller;

import com.example.employee.EmployeeApplication;
import com.example.employee.model.Department;
import java.util.Map;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

  @GetMapping("/departments")
  public ResponseEntity<Map<String, Object>> getAllDepartments() {
    ConfigurableApplicationContext applicationContext =
      EmployeeApplication.getData();

    Map<String, Department> departments = applicationContext.getBeansOfType(
      Department.class
    );

    if (!departments.isEmpty()) {
      return ResponseEntity.ok().body(
        Map.of("departments", departments.values())
      );
    }

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
      Map.of("err", "No data found!")
    );
  }
}
