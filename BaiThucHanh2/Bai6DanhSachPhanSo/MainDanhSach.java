package BaiThucHanh2.Bai6DanhSachPhanSo;

import BaiThucHanh2.Bai5PhanSo.PhanSo;

public class MainDanhSach {
    public static void main(String[] args) {
        DanhSachPhanSo danhSachPhanSo=new DanhSachPhanSo();

        danhSachPhanSo.addPhanSo(new PhanSo(8,2),new PhanSo(5,4),new PhanSo(1,2),new PhanSo(3,4), new PhanSo(8,3));
//        danhSachPhanSo.addPhanSo();
        danhSachPhanSo.hienThi();
        System.out.println();
//        PhanSo phanSo=danhSachPhanSo.tongPhanSos();
//        phanSo.rutGon();
//        phanSo.displayPhanSo();

//        System.out.println();
//
//        PhanSo minPhanSo=danhSachPhanSo.timMin();
//        minPhanSo.displayPhanSo();
//
//        System.out.println();
//
//        PhanSo maxPhanSo=danhSachPhanSo.timMax();
//        maxPhanSo.displayPhanSo();
//
//        System.out.println();
//        System.out.println();
//
//        danhSachPhanSo.sort();
//        danhSachPhanSo.hienThi();

//        danhSachPhanSo.remove(new PhanSo(16,4));
        danhSachPhanSo.remove(new PhanSo(5,4),new PhanSo(8,3), new PhanSo(24,6));
        danhSachPhanSo.hienThi();

    }
}
