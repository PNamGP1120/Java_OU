package BaiThucHanh2.bai3HinhChuNhat;

import BaiThucHanh2.Bai1Point.Diem;

public class MainHCN2 {
    public static void main(String[] args) {
        HCN2 hcn2 = new HCN2(new Diem(-2,-3),new Diem(-3,-4));
        hcn2.displayDoanThang();
        System.out.println();
        System.out.println(hcn2.chuVi());
        System.out.println(hcn2.dienTich());
    }
}
