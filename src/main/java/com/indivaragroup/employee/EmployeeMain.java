package com.indivaragroup.employee;

        /*
        ada 2 kelas objek
        - pegawai : nama, alamat, gaji, gender (L dan P)
        - main class ada 10 data isinya kota dsbnya
        - buatin function sorting berdasarkan nama (ascending A - Z)
        - buatin function sorting berdasarkan jenis kelamin, counting pria sama wanita
        - buatin function sorting berdasarkan kota
        - buatin function sorting urutan gaji ascending
         */

import com.indivaragroup.employee.data.EmployeeData;
import com.indivaragroup.employee.model.Employee;
import com.indivaragroup.employee.service.EmployeeService;

import java.util.List;

public class EmployeeMain {
    public static void resultEmployee() {
        // mengambil seluruh data karyawan dari employee data
        // method getEmployee() mengembalikan List<Employee> yang berisi dummy
        List<Employee> employees = EmployeeData.getEmployee();

        // membuat objek dari Employee Service untuk logic
        EmployeeService service = new EmployeeService();

        System.out.println("SORT BY NAMES");
        service.sortByName(employees);

        System.out.println("\nSORT BY CITY");
        service.sortByAddress(employees);

        System.out.println("\nCOUNT CITY");
        service.countCity(employees);

        System.out.println("\nSORT BY SALARY");
        service.sortBySalary(employees);

        System.out.println("\nCOUNT GENDER");
        service.countGender(employees);
    }
}
