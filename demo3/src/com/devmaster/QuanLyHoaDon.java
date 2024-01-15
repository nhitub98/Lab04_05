package com.devmaster;

import java.util.Scanner;

public class QuanLyHoaDon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma hoa don: ");
        String maHoaDon = scanner.nextLine();
        System.out.print("Ngay lap hoa don: ");
        String ngayLapHoaDon = scanner.nextLine();
        System.out.print("Ten khach hang: ");
        String tenKhachHang = scanner.nextLine();
        System.out.print("Dia chi khach hang: ");
        String diaChiKhach = scanner.nextLine();
        System.out.print("So luong banh can giao: ");
        int soLuong = scanner.nextInt();
        System.out.print("Gia ban mot chiec banh: ");
        double giaBanh = scanner.nextDouble();
        HoaDonBanhMy hoaDon = new HoaDonBanhMy(maHoaDon, ngayLapHoaDon, tenKhachHang, diaChiKhach, soLuong, giaBanh);
        System.out.println("\nIn ra thong tin hoa don:");
        hoaDon.inHoaDon();

    }
}