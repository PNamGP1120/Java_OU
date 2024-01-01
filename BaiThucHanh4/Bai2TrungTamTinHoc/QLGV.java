package BaiThucHanh4.Bai2TrungTamTinHoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QLGV {
    private List<GiangVien> ds=new ArrayList<>();
    public void themGiangVien(GiangVien... giangViens){
        this.ds.addAll(Arrays.asList(giangViens));
    }
    public void xoaGiangVien(String kw){
        this.ds.removeIf(giangVien -> giangVien.getHoTen().contains(kw));
    }
    public List<GiangVien> timGiangVien(String kw){
        return this.ds.stream().filter(giangVien -> giangVien.getHoTen().contains(kw)||giangVien.getHocHam().contains(kw)||giangVien.getHocVi().contains(kw)).toList();
    }
    public void nhapSoGio(){
        this.ds.forEach(giangVien -> {
            System.out.println("Giảng viên: "+giangVien.getHoTen());
            System.out.print("Nhập số giờ: ");
            giangVien.setTienLuong(giangVien.tinhLuong(Double.parseDouble(new Scanner(System.in).nextLine())));
        });
    }
    public void hienThi(){
        this.ds.forEach(System.out::print);
    }
}
