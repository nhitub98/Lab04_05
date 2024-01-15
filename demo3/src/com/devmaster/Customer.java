package com.devmaster;

import java.util.Scanner;

public class Customer {
    int id;
    String name;
    String address;
    int age;
    double salary;

    public Customer(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Customer() {
    }
    void input() {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Nhap id:");
         id=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Nhap ten:");
         name=scanner.nextLine();
         System.out.println("Nhap dia chi:");
         address=scanner.nextLine();
         System.out.println("Nhap tuoi:");
         age=scanner.nextInt();
         System.out.println("Nhap luong:");
         salary=scanner.nextDouble();
    }

    void input(int id, String name, String address, int age, double salary ) //truyen 5 tham so cho ham input
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    void viewData() {
        System.out.println("Customer{"+"id="+id+",name="+name+",address="+address+",age="+age+",salary="+salary+'}');
    }

    double calSalary(int bonus) {

        return salary + salary * (bonus* 0.1);
    }
    double calSalary(double bonus){

        return salary+bonus;
    }

    public static void main(String[] args) {
        Customer cust_1= new Customer();
        cust_1.input();
        cust_1.viewData();
        System.out.printf("Luong nhan vien 1:%.0f",cust_1.calSalary(15));
        Customer cust_2= new Customer();
        cust_2.input();
        cust_2.viewData();
        System.out.printf("Luong nhan vien 2:%.0f",cust_2.calSalary(12.5));
    }}