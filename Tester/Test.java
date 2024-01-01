package Tester;


import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

//    public static void main(String[] args) {
////        String date="02/02/2024";
////        LocalDate localDate=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
////        System.out.println(localDate);
//
//
//    }
    public static void main(String[] args) {
        // BaoCao bc = new BaoCao("BC001", "Báo cáo 1", "https",
        //         LocalDate.parse("01/01/2004", DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER)), "Dương Hữu Thành");
        // bc.xuatBaoCao();
        System.out.println(LocalDate.parse("01/01/2004", DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER)));
    }
}
