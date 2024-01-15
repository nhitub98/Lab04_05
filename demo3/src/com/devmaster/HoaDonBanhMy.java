package com.devmaster;

import java.util.Scanner;

public class HoaDonBanhMy {
    private String maHoaDon;
    private String ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChiKhach;
    private int soLuong;
    private double giaBanh;
    private double tongTienHang;
    private double tienKhuyenMai;
    private double tongTienThanhToan;
    public HoaDonBanhMy(String maHoaDon, String ngayLapHoaDon, String tenKhachHang, String diaChiKhach, int soLuong, double giaBanh) {
        this.maHoaDon = maHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.diaChiKhach = diaChiKhach;
        this.soLuong = soLuong;
        this.giaBanh = giaBanh;
        tinhTienKhuyenMai();
        tinhTongTienPhaiThanhToan();
    }
    private void tinhTienKhuyenMai() {
        if (soLuong >= 100) {
            tienKhuyenMai = 0.2 * tongTienHang;
        } else if (soLuong >= 10) {
            tienKhuyenMai = 0.1 * tongTienHang;
        }
    }
    private void tinhTongTienPhaiThanhToan() {
        tongTienHang = soLuong * giaBanh;
        tongTienThanhToan = tongTienHang - tienKhuyenMai;
    }
    public void inHoaDon() {
        System.out.println("Ma hoa don: " + maHoaDon);
        System.out.println("Ngay lap hoa don: " + ngayLapHoaDon);
        System.out.println("Ten khach hang: " + tenKhachHang);
        System.out.println("Dia chi : " + diaChiKhach);
        System.out.println("So luong banh: " + soLuong);
        System.out.println("Gia ban 1 chiec banh: " + giaBanh);
        System.out.println("Tong tien hang: " + tongTienHang);
        System.out.println("Tien khuyen mai: " + tienKhuyenMai);
        System.out.println("Tong tien phai thanh toan: " + tongTienThanhToan);
    }
}
