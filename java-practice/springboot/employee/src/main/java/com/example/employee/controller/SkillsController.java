package com.example.employee.controller;

import com.example.employee.EmployeeApplication;
import com.example.employee.model.Skills;
import java.util.Map;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController {

  @GetMapping("/skills")
  public ResponseEntity<Map<String, Object>> getAllSkills() {
    ConfigurableApplicationContext applicationContext =
      EmployeeApplication.getData();

    Map<String, Skills> skills = applicationContext.getBeansOfType(
      Skills.class
    );

    if (!skills.isEmpty()) {
      return ResponseEntity.ok(Map.of("skills", skills.values()));
    }

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
      Map.of("err", "No data found!")
    );
  }
}
