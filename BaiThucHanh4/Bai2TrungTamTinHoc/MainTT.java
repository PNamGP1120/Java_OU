package BaiThucHanh4.Bai2TrungTamTinHoc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainTT {
    public static void main(String[] args) {
        QLGV qlgv=new QLGV();
        qlgv.themGiangVien(
                new GiangVienCoHuu(
                        "GV1",
                        LocalDate.parse("02/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        "HH1",
                        "HV1",
                        LocalDate.parse("02/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        200000,
                        2.5
                )
                ,
                new GiangVienThinhGiang(
                        "GV2",
                        LocalDate.parse("01/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        "HH1",
                        "HV1",
                        LocalDate.parse("01/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        "Tây Ninh"
                )
                ,
                new GiangVienCoHuu(
                        "GV3",
                        LocalDate.parse("03/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        "HH1",
                        "HV1",
                        LocalDate.parse("01/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        50000,
                        2.3
                )
                ,
                new GiangVienThinhGiang(
                        "GV4",
                        LocalDate.parse("01/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        "HH1",
                        "HV1",
                        LocalDate.parse("01/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        "Hồ Chí Minh"
                )
        );

        qlgv.nhapSoGio();
        qlgv.hienThi();

    }
}
