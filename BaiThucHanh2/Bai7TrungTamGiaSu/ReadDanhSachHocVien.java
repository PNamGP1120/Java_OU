package BaiThucHanh2.Bai7TrungTamGiaSu;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadDanhSachHocVien {
    private LinkedList<HocVien> hocViens=new LinkedList<HocVien>();
    public void addHocVien(HocVien hocVien){
        hocViens.add(hocVien);
    }
    public void readFile() throws FileNotFoundException, ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/mm/yyyy");
        Scanner sc =new Scanner(new File("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai7TrungTamGiaSu\\hocvien.txt"));
        while (sc.hasNextLine()){
            hocViens.add(new HocVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
    }
    public void writeFileHocBong(LinkedList<HocVien>hocViensMain) throws IOException {
        FileWriter fileWriter=new FileWriter("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai7TrungTamGiaSu\\hocbong.txt");
        for(HocVien hocVien:hocViensMain){
            fileWriter.write(hocVien.getMaHocVien() +" - ");
            fileWriter.write(hocVien.getHoTen()+" - ");
            fileWriter.write(Float.toString((float) Math.round(hocVien.getGpa()*100)/100)+'\n');
        }
        fileWriter.close();
        System.out.println(".....");
    }

    public LinkedList<HocVien> getHocViens() {
        return hocViens;
    }
}
