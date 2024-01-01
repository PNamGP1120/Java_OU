package BaiThucHanh2.bai3HinhChuNhat;

import BaiThucHanh2.Bai1Point.Diem;

public class MainHinhChuNhat {
    public static void main(String[] args) throws Exception {
//        HinhChuNhat hinhChuNhat=new HinhChuNhat(new Diem(2,3),new Diem(4,2));
        HinhChuNhat hinhChuNhat=new HinhChuNhat();
        hinhChuNhat.setPointTopLeft(new Diem(-3,-7));
        hinhChuNhat.setPointBottomright(new Diem(2,1));
        hinhChuNhat.displayHinhChuNhat();
        System.out.println();
        System.out.println(hinhChuNhat.dienTich());
        System.out.println(hinhChuNhat.chuVi());
    }
}
