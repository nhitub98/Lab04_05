package com.devmaster;

public class Shape {
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_TRIANGLE = 3;
    public int shapeCode = 0;

    public float tinhDienTich(float width, float height) {
       return width*height;
    }

    public double tinhDienTich(float radius) {
        return radius * 2 * 3.14;
    }

    public double tinhDienTich(float height, double bottom) {
     return 0.5*height*bottom;
    }

    public float tinhChuVi(float width, float height) {
    return (width+height)*2;
    }

    public double tinhChuVi(float radius) {
        return radius * 2 * 3.14;
    }

    public float calculatePerimeter(float edge1, float edge2, float edge3) {
        return  edge1+edge2+edge3;
    }
}