package BaiThucHanh4.Bai2TrungTamTinHoc;

import java.time.LocalDate;

public class GiangVienCoHuu extends GiangVien{
    private double luongCoBan;
    private double heSoLuong;
    public GiangVienCoHuu(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDau, double luongCoBan, double heSoLuong){
        super(hoTen,ngaySinh,hocHam,hocVi,ngayBatDau);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;

    }

    @Override
    public double tinhLuong(double soGioLamViec) {
        return soGioLamViec*90000+this.luongCoBan*this.heSoLuong;
    }
}
