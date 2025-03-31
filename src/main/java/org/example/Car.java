package org.example;
import java.time.Year;

public class Car {
    private String brand, model;
    private int year;
    private double price;

    public Car(){
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2000;
        this.price = 0.0;
    }
    public Car(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake(){
        return this.brand;
    }
    public void setMake(String make){
        this.brand = make;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = Math.max(1886, year);

    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = Math.max(0, price);
    }


    public void print(){
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println(this.price);
    }

    public double calculateDepreciation(){
        int currentYear = Year.now().getValue();
        return this.price * Math.pow(0.85, currentYear - this.year);
    }

}
