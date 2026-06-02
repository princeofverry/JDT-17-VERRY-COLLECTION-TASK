package com.indivaragroup.employee.data;

import com.indivaragroup.employee.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployee() {
        // membuat arraylist untuk menampung data dummy seluruh karyawan
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Andi", "Jakarta", 7000000, 'L'));
        employees.add(new Employee("Budi", "Bandung", 6000000, 'L'));
        employees.add(new Employee("Citra", "Semarang", 8000000, 'P'));
        employees.add(new Employee("Dewi", "Surabaya", 7500000, 'P'));
        employees.add(new Employee("Eko", "Jakarta", 5500000, 'L'));
        employees.add(new Employee("Fitri", "Bandung", 9000000, 'P'));
        employees.add(new Employee("Gilang", "Yogyakarta", 6500000, 'L'));
        employees.add(new Employee("Hani", "Semarang", 8500000, 'P'));
        employees.add(new Employee("Indra", "Surabaya", 15000000, 'L'));
        employees.add(new Employee("Jihan", "Yogyakarta", 9500000, 'P'));

        return employees;
    }
}
