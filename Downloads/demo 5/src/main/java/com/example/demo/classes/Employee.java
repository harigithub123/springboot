package com.example.demo.classes;

class Employee {
    private int employeeId;
    private String name;
    private float salary;

    public void setEmployeeId(int eid) {
        this.employeeId = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public float getSalary() {
        return this.salary;
    }
}
