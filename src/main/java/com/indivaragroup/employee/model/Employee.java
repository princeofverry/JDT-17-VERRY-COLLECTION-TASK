package com.indivaragroup.employee.model;

public class Employee {
    private String name;
    private String address;
    private double salary;
    private char gender;

    public Employee(String name, String address, double salary, char gender) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nama='" + name + '\'' +
                ", alamat='" + address + '\'' +
                ", gaji=" + salary +
                ", gender=" + gender +
                '}';
    }
}
