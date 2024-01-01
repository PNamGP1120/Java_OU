package BaiThucHanh4.Bai1hinh;

import java.lang.reflect.InvocationTargetException;

public class MainHinh {
    public static void main(String[] args) {
        QLhinh qLhinh=new QLhinh();
        qLhinh.themHinh(new TamGiac("Tam giác",2,3,4),new TamGiacCan("Cân", 3,4 ),new TamGiacDeu("Đều", 5));
        qLhinh.themHinh(new Ellipse("Ellip",3,4),new HinhTron("Tròn",4), new HinhTron("Tròn",5));
        qLhinh.themHinh(new HinhChuNhat("Chữ Nhật",3,4),new HinhVuong("Vuông", 5));

        qLhinh.hienThi();
        System.out.println();
        qLhinh.xoaHinh("Vuông");
        qLhinh.hienThi();
        System.out.println();

        try{
            qLhinh.layMotLoaiHinh("BaiThucHanh4.Bai1hinh.HinhTron").forEach(hinh -> System.out.print(hinh));

        } catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        qLhinh.sort();
        System.out.println();
//        qLhinh.sort(-1);
        qLhinh.hienThi();

        System.out.println(qLhinh.timHinh(new HinhChuNhat("Chữ Nhật",3,5)));
    }
}
