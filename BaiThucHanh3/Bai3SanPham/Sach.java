package BaiThucHanh3.Bai3SanPham;

import java.io.FileWriter;
import java.io.IOException;

public class Sach extends SanPham{
    private int sotrang;

    public Sach(){
        super();
    }
    public Sach(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaBan, int sotrang) {
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan);
        this.sotrang=sotrang;
    }
    public Sach(String[]args){
        this(args[0],args[1],args[2],args[3],Double.parseDouble(args[4]),Integer.parseInt(args[5]));
    }

    public void nhapSanPham(){
        super.nhapSanPham();
        System.out.print("Nhập số trang: ");
        this.sotrang=Integer.parseInt(scanner.nextLine());
        this.saveFile();
    }

    public void hienThi(){
        super.hienThi();
        System.out.printf("Số trang: %d\n",this.sotrang);
    }

    @Override
    public String stringForFile() {
        return super.stringForFile().concat(String.format("-%s\n",this.sotrang));
    }

    public void saveFile(){
        String path="D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh3\\Bai3SanPham\\Data\\Sach.txt";
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write(this.stringForFile());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
