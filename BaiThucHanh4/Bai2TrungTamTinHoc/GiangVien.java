package BaiThucHanh4.Bai2TrungTamTinHoc;

import java.time.LocalDate;

public abstract class GiangVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private String hocHam;
    private String hocVi;
    private LocalDate ngayBatDau;
    private double tienLuong;
    protected GiangVien(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDau) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDau = ngayBatDau;
    }
    public abstract double tinhLuong(double soGioLamViec);

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    @Override
    public String toString() {
        return String.format("Tên giảng viên: %s\nLương: %.2f\n",this.hoTen,this.tienLuong);
    }
}
