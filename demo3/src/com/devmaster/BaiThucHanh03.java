package com.devmaster;

import java.util.Scanner;

public class BaiThucHanh03 {
    public static void main(String[] args) {
        SinhVien sv1=new SinhVien();
        sv1.setRollNo(1);
        sv1.setName("Ngoc");
        SinhVien sv2= new SinhVien(2,"Hien","Hai Phong");
        SinhVien sv3= new SinhVien(3,"Quang","Quang Ninh",4);
        sv1.viewData();
        sv2.viewData();
        sv3.viewData();
    }
}
