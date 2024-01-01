package BaiThucHanh3.Bai3SPAbstract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CoKyHan extends TaiKhoan {
    private KyHan kyHan;
    private LocalDate ngayDaohan;
    public CoKyHan(String tenTaiKhoan, String soDienThoai, String email, double soTien, LocalDate ngayTao, TrangThai trangThai, KyHan kyHan) {
        super(tenTaiKhoan,soDienThoai,email,soTien,ngayTao,trangThai);
        this.kyHan=kyHan;
        this.ngayDaohan=kyHan.tinhNgayDaoHan(ngayTao);
    }

    @Override
    public void xemThongTin() {
        super.xemThongTin();
        System.out.printf("Kỳ hạn: %s\n",this.kyHan);
        System.out.printf("Ngày đáo hạn: %s\n",this.ngayDaohan.format(DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER)));
    }

    @Override
    public boolean isNgayDaoHan() {
        return LocalDate.now().equals(this.ngayDaohan);
    }

    @Override
    public double tinhLai() {
        return kyHan.tinhLai(this.soTien);
    }
}
