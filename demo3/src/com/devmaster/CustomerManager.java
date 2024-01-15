package com.devmaster;

import java.util.Scanner;

public class CustomerManager {
    Customer globalCus = new Customer();
void inputCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap ten:");
        String name = input.nextLine();
        System.out.println("Nhap dia chi:");
        String address = input.nextLine();
        System.out.println("Nhap tuoi:");
        int age = input.nextInt();
        System.out.println("Nhap luong:");
        double salary = input.nextDouble();
        globalCus.input(id, name, address, age, salary);
    }
public static void main(String[] args) {
        Customer nhanvien = new Customer();
        nhanvien.input();
        nhanvien.viewData();
        CustomerManager manager=new CustomerManager();
        manager.inputCustomer();
        CustomerManager manager1=new CustomerManager();
        manager1.inputCustomer();
        Customer testCon=new Customer(3, "Shin Dong Hiep", "Gam cau", 19, 3500000);
        testCon.viewData();
    }
}


