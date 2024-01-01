package BaiThucHanh4.Bai2TrungTamTinHoc;

import java.time.LocalDate;

public class GiangVienThinhGiang extends GiangVien{
    private String noiCongtac;
    public GiangVienThinhGiang(String hoTen, LocalDate ngaySinh, String hocHam, String hocVi, LocalDate ngayBatDau, String noiCongtac){
        super(hoTen,ngaySinh,hocHam,hocVi,ngayBatDau);
        this.noiCongtac=noiCongtac;

    }

    @Override
    public double tinhLuong(double soGioLamViec) {
        return soGioLamViec*90000;
    }
}
