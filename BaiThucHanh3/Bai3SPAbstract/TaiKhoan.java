package BaiThucHanh3.Bai3SPAbstract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaiKhoan {
    private static int dem;
    private final String soTaiKhoan=String.format("ID%04d",++dem);
    private String tenTaiKhoan;
    private String soDienThoai;
    private String email;
    protected double soTien;
    private LocalDate ngayTao;
    private TrangThai trangThai;


    public TaiKhoan(String tenTaiKhoan, String soDienThoai, String email, double soTien, LocalDate ngayTao, TrangThai trangThai) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.soTien = soTien;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public void xemThongTin(){
        System.out.printf("Số tài khoản: %s\n",this.soTaiKhoan);
        System.out.printf("Tên tài khoản: %s\n",this.tenTaiKhoan);
//        System.out.printf("Số điện thoại: %s\n",this.soDienThoai);
//        System.out.printf("Email: %s\n",this.email);
        System.out.printf("Số tiền: %.2f\n",this.soTien);
//        System.out.printf("Ngày tạo: %s\n",this.ngayTao.format(DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER)));
//        System.out.printf("Trạng thái: %s\n",this.trangThai);
        System.out.printf("Loại tài khoản: %s\n",(this.getClass().getSimpleName().equals("TaiKhoan")?"Tài khoản không kỳ hạn":"Tài khoản có kỳ hạn"));
        System.out.printf("Tiền lãi: %.2f\n",this.tinhLai());
    }
    public double tinhLai(){
        return soTien*0.001;
    }

    public void nopTien(double soTien){
        if(isNgayDaoHan()){
            this.soTien+=soTien;
        }
    }

    public void rutTien(double soTien){
        if(this.soTien>=soTien && isNgayDaoHan()){
            this.soTien-=soTien;
        }
    }
    public boolean isNgayDaoHan(){
        return true;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }
}
