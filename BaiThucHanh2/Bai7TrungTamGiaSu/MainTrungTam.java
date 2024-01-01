package BaiThucHanh2.Bai7TrungTamGiaSu;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MainTrungTam {
    public static void menu(){
        System.out.println("      Menu");
        System.out.println("1. Nhập danh sách học viên.");
        System.out.println("2. Nhập điểm cho học viên.");
        System.out.println("3. Hiển thị danh sách học viên.");
        System.out.println("4. Tìm kiếm học viên.");
        System.out.println("5. Sắp xếp danh sách học viên theo điểm.");
        System.out.println("6. Hiển thị danh sách sinh viên nhận học bổng.");
        System.out.println("7. Thống kê học viên có độ tổi nhỏ hơn 18, từ 18 đến 23, từ 24 trở lên.");
        System.out.println("0. Thoát chương trình.");
        System.out.print("--> ");
    }
    public static void main(String[] args) throws ParseException, IOException {
        QuanLySinhVien quanLySinhVien=new QuanLySinhVien();
        quanLySinhVien.readFile();
        Scanner scanner=new Scanner(System.in);
        while (true){
            menu();

            boolean flagMainExit=false;
            switch (scanner.nextInt()){
                case 1:
                {
                    boolean flagAddHocVien=true;
                    while (flagAddHocVien){
                        System.out.println("Nhập thông tin học viên: ");
                        HocVien hocVien=new HocVien();
                        hocVien.inputTongTinHocVien();
                        quanLySinhVien.themHocVien(hocVien);

                        System.out.println("Bạn muốn nhập tiếp hay không (1/0): ");
                        int count=scanner.nextInt();
                        if(count==0){
                            flagAddHocVien=false;
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Nhập điểm học viên theo mã số. ");
                    quanLySinhVien.nhapDiem();

                    break;
                }
                case 3:
                {
                    System.out.println("Danh sách học viên: ");
                    quanLySinhVien.hienThiDanhSach();
                    break;
                }
                case 4:
                {
                    System.out.println("Tìm kiếm học viên, nhập tên, mã số hoặc quê quán: ");

                    String key=CauHinh.scanner.nextLine();
                    try {
                        quanLySinhVien.timKiem(Integer.parseInt(key)).displayHocVien();
                    }catch (Exception exception){
                        quanLySinhVien.timKiem(key).forEach(HocVien::displayHocVien);
                    }
                    break;
                }
                case 5:
                {

                    quanLySinhVien.sapXep();
                    System.out.println("Đã sắp xếp xong");
                    break;
                }
                case 6:
                {
                    System.out.println("Danh sách sinh viên nhận học bổng\n");
                    quanLySinhVien.hocBong().forEach(HocVien::displayHocVien);
                    quanLySinhVien.writeFileHocBong();
                    break;
                }
                case 7:
                {
//                    int flag18=0;
//                    int flag18to23=0;
//                    int flag24=0;
//
//                    for(HocVien hocVien:quanLySinhVien){
//                        int age=new Date().getYear()-hocVien.getNgaySinh().getYear();
//                        if(age<18){
//                            flag18++;
//                        } else if (age>=18 && age<=22) {
//                            flag18to23++;
//                        } else {
//                            flag24++;
//                        }
//                    }
//                    System.out.println("Số lượng học viên dưới 18: "+flag18);
//                    System.out.println("Số lượng học viên trên 18 dưới 23: "+flag18to23);
//                    System.out.println("Số lượng học viên trên 24: "+flag24);

                    break;
                }
                case 8:{
                    quanLySinhVien.hienThiDiem();
                    break;
                }
                case 0:
                {
                    System.out.println("Thoát chương trình.");
                    flagMainExit=true;
                    break;
                }
            }
            if(flagMainExit)
                break;

        }
    }
}
