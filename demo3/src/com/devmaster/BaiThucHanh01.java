package com.devmaster;

import java.util.Scanner;

public class BaiThucHanh01 {
    public static void main(String[] args) {
        System.out.println("Nhap nhiet do vua chuyen doi");
        Scanner input= new Scanner(System.in);
        float nhietDo=input.nextFloat();
        input.nextLine();
        System.out.println(("Nhiet do ban vua nhap la: C/F"));
        char type=input.nextLine().charAt(0);
        ConvertTemperature convert= new ConvertTemperature();
        switch (type){
            case 'C':
                convert.convert(nhietDo,true);
                break;
            case 'F':
                convert.convert(nhietDo,false);
                break;
        }
    }
}
