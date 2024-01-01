package BaiThucHanh3.Bai3SanPham;

import java.io.FileWriter;
import java.io.IOException;

public class BangDia extends SanPham {
    private int soPhut;

    public BangDia(){
        super();
    }
    public BangDia(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaBan,int soPhut) {
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan);
        this.soPhut=soPhut;
    }
    public BangDia(String[]args){
        this(args[0],args[1],args[2],args[3],Double.parseDouble(args[4]),Integer.parseInt(args[5]));
    }

    public void nhapSanPham(){
        super.nhapSanPham();
        System.out.print("Nhập số phút: ");
        this.soPhut=Integer.parseInt(scanner.nextLine());
        this.saveFile();
    }
    public void hienThi(){
        super.hienThi();
        System.out.printf("Số phút: %d\n",this.soPhut);
    }

    @Override
    public String stringForFile() {
        return super.stringForFile().concat(String.format("-%s\n",this.soPhut));
    }

    public void saveFile(){
        String path="D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh3\\Bai3SanPham\\Data\\BangDia.txt";
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write(this.stringForFile());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
