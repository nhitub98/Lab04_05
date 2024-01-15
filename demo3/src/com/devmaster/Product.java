package com.devmaster;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public Product() {
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma san pham:");
        prodId = scanner.nextLine();
        System.out.println("Ten san pham:");
        prodName = scanner.nextLine();
        System.out.println("Nha san xuat:");
        manufacturer = scanner.nextLine();
        System.out.println("Gia san xuat:");
        producerPrice = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId='" + prodId + '\'' +
                ", prodName='" + prodName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", producerPrice=" + producerPrice +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }

    public float calculateSalePrice() {
        return producerPrice + (producerPrice * 0.05f);
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.input();
        product.display();
        System.out.println("Gia ban la: " + product.calculateSalePrice());
    }
}