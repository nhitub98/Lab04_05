package com.devmaster;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName; //khai bao lop
    private String lastName;
    private String address;

    public Student(String firstName, String lastName, String address) { // constructor, khởi tạo gtri biến
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public Student(){ //Constructor k tham so
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("First name:");
        firstName=scanner.nextLine();
        System.out.println("Last name:");
        lastName=scanner.nextLine();
        System.out.println("Address:");
        address=scanner.nextLine();
    }

    public void display(){ // Hàm xuất giá trị
        String name= lastName+" "+firstName;
        System.out.println("Ten cua hoc sinh la" +name);
        System.out.println("Co dia chi " + address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; //doi tuong - dau vao
    }

    public static void main(String[] args) {
        Student student1= new Student("Tung", "Nguyen", "Ha Noi"); //khoi tao doi tuong
        Student student2=new Student();
        student2.input();
        student2.display();
        student2.setFirstName("Thao");
        student2.display();
//        student2.input();
//        System.out.println("student 1");
//        student1.display();
//        System.out.println("student 2");
//        student2.display();
    }
}
