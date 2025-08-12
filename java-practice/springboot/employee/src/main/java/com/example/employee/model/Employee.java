package com.example.employee.model;

import java.util.ArrayList;

public class Employee {

  private long id;
  private String name;
  private Department dept;
  private ArrayList<Skills> skills;

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Department getDept() {
    return dept;
  }

  public ArrayList<Skills> getSkills() {
    return skills;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDept(Department dept) {
    this.dept = dept;
  }

  public void setSkills(ArrayList<Skills> skills) {
    this.skills = skills;
  }
}
