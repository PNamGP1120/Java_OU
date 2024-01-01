package BaiThucHanh3.Bai3SPAbstract;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        QuanLyTaiKhoan danhSachTaiKhoan=new QuanLyTaiKhoan();
        danhSachTaiKhoan.themTaiKhoan(new TaiKhoan("Đặng Phương Nam","0908945765","phuongnam.it0212@gmail.com",50000, LocalDate.now(),TrangThai.DANG_HOAT_DONG));
        danhSachTaiKhoan.themTaiKhoan(new CoKyHan("Nguyễn Đặng Gia Phúc","038424247","yaphuc257@gmail.com",100000,LocalDate.now(),TrangThai.DANG_HOAT_DONG,KyHan.MOT_NAM));
        danhSachTaiKhoan.xemThongTin();
        danhSachTaiKhoan.nopTien("ID0002",25000);
        danhSachTaiKhoan.xemThongTin("ID0002");
        danhSachTaiKhoan.rutTien("ID0002",10000);
        danhSachTaiKhoan.xemThongTin("ID0002");

    }
}
