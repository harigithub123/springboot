package com.example.demo.oops;

public class Vehicle { //parent class or Base class
    protected String colour;
    protected String brand;
    protected String fuelType;
    protected String makingYear;
    protected String chassisNumber;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getMakingYear() {
        return makingYear;
    }

    public void setMakingYear(String makingYear) {
        this.makingYear = makingYear;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }
}
