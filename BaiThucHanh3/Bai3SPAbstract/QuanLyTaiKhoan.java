package BaiThucHanh3.Bai3SPAbstract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLyTaiKhoan {
    List<TaiKhoan>danhSachtaiKhoan=new ArrayList<>();
    public void themTaiKhoan(TaiKhoan taiKhoan){
        this.danhSachtaiKhoan.add(taiKhoan);
    }
    public void themTaiKhoan(TaiKhoan... taiKhoans){
        this.danhSachtaiKhoan.addAll(Arrays.asList(taiKhoans));
    }
    public void xemThongTin(){
        this.danhSachtaiKhoan.forEach(taiKhoan -> {
            taiKhoan.xemThongTin();
            System.out.println();
        });
    }
    public void xemThongTin(String soTaiKhoan){
        this.danhSachtaiKhoan.stream().filter(taiKhoan -> taiKhoan.getSoTaiKhoan().equals(soTaiKhoan)).findFirst().get().xemThongTin();
    }
    public void nopTien(String soTaiKhoan, double soTien){
        this.danhSachtaiKhoan.stream().filter(taiKhoan -> taiKhoan.getSoTaiKhoan()
                .equals(soTaiKhoan)).findFirst().get().nopTien(soTien);
    }
    public void rutTien(String soTaiKhoan, double soTien){
        this.danhSachtaiKhoan.stream().filter(taiKhoan -> taiKhoan.getSoTaiKhoan()
                .equals(soTaiKhoan)).findFirst().get().rutTien(soTien);
    }
}
