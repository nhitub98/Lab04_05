package com.devmaster;

import java.util.Scanner;

public class MainClass {
    public MainClass() {

    }
    void inputCustomeData(Customer nv){ // ham nhap du lieu
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id:");
        nv.id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap name:");
        nv.name=scanner.nextLine();
        System.out.println("Nhap address:");
        nv.address=scanner.nextLine();
        System.out.println("Nhap tuoi:");
        nv.age=scanner.nextInt();
        System.out.println("Nhap salary:");
        nv.salary=scanner.nextDouble();
    }
//
//    void viewData(){
//        System.out.println("Customer{"+"id="+id+",name="+name+",address="+address+",age="+age+",salary="+salary+'}');
//
//    }
    public static void main(String[] args) {
        Customer cust_1= new Customer(); // khoi tao doi tuong customer bang constructor mac dinh
        Customer cust_2= new Customer();
        MainClass main=new MainClass();
        System.out.println("Nhap du lieu nhan vien 1");
        main.inputCustomeData(cust_1);
        System.out.println("Nhap du lieu nhan vien 2");
        main.inputCustomeData(cust_2);
        cust_1.viewData();
        cust_2.viewData();
        System.out.printf("Tien luong nhan vien 1:%.0f", cust_1.calSalary(15));
        System.out.printf("Tien luong nhan vien 2:%.0f", cust_2.calSalary(69000));
    }
    }
