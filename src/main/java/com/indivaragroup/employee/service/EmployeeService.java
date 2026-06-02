package com.indivaragroup.employee.service;

import com.indivaragroup.employee.model.Employee;

import java.util.*;

public class EmployeeService {
    public void sortByName(List<Employee> employees) {
        // Mengurutkan karyawan berdasarkan namanya dengan abjad
        // Comparator.comparing() akan mengambil nilai name dari setiap object Employee
        employees.sort(Comparator.comparing(Employee::getName));

        // menampilkan semua urutannya yang telah disortir.
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void sortByAddress(List<Employee> employees) {
        // Mengurutkan karyawan berdasarkan kota-nya diurutkan berdasarkan abjad.
        // Method getAddress() digunakan sebagai acuan pengurutan.
        employees.sort(Comparator.comparing(Employee::getAddress));

        // menampilkan semua urutannya yang telah disortir.
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void sortBySalary(List<Employee> employees) {
        // Comparator.comparing() secara default mengurutkan dari kecil ke besar.
        // Method reversed() digunakan untuk membalik urutan sehingga
        // gaji ditampilkan dari yang terbesar ke yang terkecil.
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());

        // menampilkan semua urutannya yang telah disortir.
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void countCity(List<Employee> employees) {
        // Membuat hashmap untuk menampung perhitungan kota per-orang
        // Key   : Nama kota (String)
        // Value : Jumlah karyawan pada kota tersebut (Integer)
        Map<String, Integer> cityCount = new HashMap<>();

        // iterasi seluruh karyawan
        for (Employee employee : employees) {
            // mengambil nama kota setiap karyawan
            String city = employee.getAddress();
            // getOrDefault(city, 0) berarti:
            // - Jika kota sudah ada di map, ambil nilainya.
            // - Jika belum ada, gunakan nilai default 0.
            // Kemudian ditambah 1 karena ditemukan karyawan lain pada kota tsb.
            cityCount.put(city, cityCount.getOrDefault(city, 0) + 1);
        }

        // menampilkan hasil perhitungan
        cityCount.forEach((city, count) ->
                System.out.println(city + " : " + count));
    }

    public void countGender(List<Employee> employees) {
        // membuat hashmap untuk menyimpan jumlah karyawan berdasarkan gender
        // key = Gender (L/P)
        // value = jumlah karyawan pada gender tsb.
        Map<Character, Integer> genderCount = new HashMap<>();

        // iterasi seluruh karyawan
        for(Employee employee : employees) {
            // ambil data gender tiap karyawan
            Character gender = employee.getGender();

            // Jika gender sudah ada pada map maka nilainya ditambah 1.
            // Jika belum ada maka dibuat dengan nilai awal 1.
            genderCount.put(gender, genderCount.getOrDefault(gender, 0) + 1);
        }

        // menampilkan hasil perhitungan
        genderCount.forEach((gender, count) ->
                System.out.println("gender : " + gender + " = " + count));
    }
}
