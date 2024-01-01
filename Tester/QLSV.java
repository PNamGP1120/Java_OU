package Tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSV {
    private List<SinhVien> sinhViens=new ArrayList<>();
    public void themSinhVien(SinhVien sinhVien){
        this.sinhViens.add(sinhVien);
    }
    public void loadFile(String path) throws FileNotFoundException {
        File file=new File("D:\\IdeaProjects\\Java_OU\\src\\Tester\\data\\a.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
            this.themSinhVien(new SinhVien(scanner.nextLine()));
        }
        scanner.close();
    }
    public void hienThi(){
        this.sinhViens.forEach(SinhVien::hienSinhVien);
    }
}
