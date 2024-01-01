package BaiThucHanh2.Bai7TrungTamGiaSu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLySinhVien {
    private List<HocVien> danhSachHocVien=new LinkedList<>();
    public void themHocVien(HocVien... hocViens){
        this.danhSachHocVien.addAll(Arrays.stream(hocViens).toList());
    }

    public void nhapDiem(){
        for (HocVien hocVien : danhSachHocVien) {
            System.out.printf("Nhập điểm học viên %s\n", hocVien.getHoTen());
            hocVien.inputDiemHocVien();
        }
    }
    public void hienThiDiem(){
        System.out.printf("| %-7s| %-25s| %-12s| %-12s| %-7s| %-7s| %-7s| %-7s|\n","Mã HV","Họ và tên","Ngày sinh","Quê quán","Đ toán","Đ văn","Đ anh","GPA");
        for(HocVien hocVien:danhSachHocVien){
            hocVien.disPlayDiem();
        }
    }
    public void hienThiDanhSach(){
        System.out.printf("| %-7s| %-25s| %-12s| %-12s|\n","Mã HV","Họ và tên","Ngày sinh","Quê quán");
        for(HocVien hocVien:danhSachHocVien){
            hocVien.displayHocVien();
        }
    }
    public List<HocVien> timKiem(String keyword){
        return this.danhSachHocVien.stream().filter(hocVien ->
            hocVien.getHoTen().contains(keyword)|| hocVien.getQueQuan().contains(keyword)
        ).collect(Collectors.toList());
    }
    public HocVien timKiem(int maHocVien){
        return this.danhSachHocVien.stream().filter(hocVien -> hocVien.getMaHocVien()==maHocVien).findFirst().get();
    }

    public List<HocVien> hocBong(){
        return this.danhSachHocVien.stream().filter(HocVien::isHocBong).collect(Collectors.toList());
    }
    public void sapXep(){
        this.danhSachHocVien.sort((h1,h2)->
            -h1.isGpaLonHon(h2)
        );
    }


    public void readFile() throws FileNotFoundException, ParseException {

        Scanner sc =new Scanner(new File("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai7TrungTamGiaSu\\hocvien.txt"));
        while (sc.hasNextLine()){
            danhSachHocVien.add(new HocVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }

    }

    public void writeFileHocBong() throws IOException {
        FileWriter fileWriter=new FileWriter("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai7TrungTamGiaSu\\hocbong.txt");
        for(HocVien hocVien:danhSachHocVien){
            if(hocVien.isHocBong()){
                fileWriter.write(hocVien.getMaHocVien() +" - ");
                fileWriter.write(hocVien.getHoTen()+" - ");
                fileWriter.write(Float.toString((float) Math.round(hocVien.getGpa()*100)/100)+'\n');
            }
        }
        fileWriter.close();
        System.out.println(".....");
    }
}
