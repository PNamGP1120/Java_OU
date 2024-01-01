package Tester;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SinhVien {
    private long MSSV;
    private String hoVa;
    private String ten;
    private LocalDate ngaySinh;
    private String khoa;
    private String queQuan;
    public SinhVien(String dataSinhVien){
        String[]data=dataSinhVien.split(",");
        this.MSSV=Long.parseLong(data[0]);
        this.hoVa=data[1];
        this.ten=data[2];
//        try {
//            this.ngaySinh= LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//        } catch (DateTimeParseException dateTimeParseException){
//            this.ngaySinh= LocalDate.parse(data[3], DateTimeFormatter.ofPattern("d-M-yyyy"));
//        }
        this.ngaySinh= LocalDate.parse(data[3], DateTimeFormatter.ofPattern("d-M-yyyy"));

        this.khoa=data[4];
        this.queQuan=data[5];
//        this.ngaySinh=LocalDate.now();
//        System.out.println(data[3]);
    }
    public void hienSinhVien(){
        System.out.printf("%d-%s-%s-%s-%s-%s\n",
                this.MSSV,this.hoVa,this.ten,
                this.ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),this.khoa,this.queQuan);
    }
}
