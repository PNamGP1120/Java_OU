package BaiThucHanh2.Bai2DoanThang;

import BaiThucHanh2.Bai1Point.Diem;

public class MainDoanThang {
    public static void main(String[] args) {
        DoanThang doanThang=new DoanThang(new Diem(3,5),new Diem(4,6));
        System.out.print("Đoạn thẳng 1: ");
        doanThang.displayDoanThang();
        System.out.printf("\nKhoảng cách giữa 2 điểm: %.2f",doanThang.distance2Point());
        System.out.print("\nTrung điểm của 2 điểm: ");
        doanThang.trungDiem().displayDiem();

        DoanThang doanThang2=new DoanThang(new Diem(3,5),new Diem(4,6));
        System.out.print("\nĐoạn thẳng 2: ");
        doanThang2.displayDoanThang();
        System.out.printf("\nĐoạn thẳng 1%ssong song đoạn thẳng 2\n",(doanThang.isSongSong(doanThang2)?" ":" không "));

        doanThang.viTriTuongDoi(doanThang2);
    }
}
