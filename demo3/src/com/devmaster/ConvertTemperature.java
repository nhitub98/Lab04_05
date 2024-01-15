package com.devmaster;

import java.util.Scanner;

public class ConvertTemperature {
    private float temperNum; // thuoc tinh private kieu float

    public ConvertTemperature(float temperNum) {
        this.temperNum = temperNum;
    }
    public ConvertTemperature(){}

private float convertC2F() {
        return (float) (temperNum*1.8+32);
}
private float convertF2C(){
        return(float) ((temperNum-32)/1.8);
}
public void convert(float nhietDo, boolean isToC){ //truyen vao ham 2 tham so
        this.temperNum=nhietDo;
        if(isToC){
            System.out.println("Nhiet do"+nhietDo+"C"+ convertC2F()+"F");
        }else{
            System.out.println("Nhiet do"+nhietDo+ "F"+ convertF2C()+"C");
        }

}
    public static void main(String[] args) {
        System.out.println("Nhap nhiet do");
        Scanner input=new Scanner(System.in);
        float nhietDo=input.nextFloat();
        input.nextLine();


    }
}

