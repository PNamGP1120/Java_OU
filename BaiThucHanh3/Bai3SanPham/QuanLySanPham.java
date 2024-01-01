package BaiThucHanh3.Bai3SanPham;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class QuanLySanPham {

    private final List<SanPham> sanPhams=new LinkedList<>();

    public void themSanPham(SanPham sanPham){
        sanPhams.add(sanPham);
        saveFileTxt();
    }
    public void themSanPham(SanPham... sanPhams){
        this.sanPhams.addAll(Arrays.asList(sanPhams));
        saveFileTxt();
    }

    public void hienThi(){
        for(SanPham sanPham:sanPhams){
            sanPham.hienThi();
            System.out.println();
        }
    }
    public void xoaSanPham(SanPham sanPham){
        sanPhams.remove(sanPham);
        saveFileTxt();
    }
    public void xoaSanPham(String maSP){
        this.sanPhams.removeIf(sanPham -> sanPham.getMaSanPham().equals(maSP));
        saveFileTxt();
    }
    public SanPham timSanPham(String maSP){
        for(SanPham sanPham:sanPhams){
            if(sanPham.getMaSanPham().equals(maSP))
                return sanPham;
        }
        return null;
    }

    public LinkedList<SanPham> timSanPham(double min, double max){
        LinkedList<SanPham>sp=new LinkedList<>();
        this.sanPhams.forEach(sanPham -> {
            if(sanPham.getGiaBan()>=min&&sanPham.getGiaBan()<=max){
                sp.add(sanPham);
            }
        });
        return sp;
    }

    public void sorted(){
        this.sanPhams.sort(SanPham::compared);
    }

    /**
     * hàm đọc file
     * @throws FileNotFoundException
     */
    public void docFile() throws FileNotFoundException {
        File dir=new File("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh3\\Bai3SanPham\\Data");
//        File[] paths=dir.listFiles();
        File[]paths=dir.listFiles();

        assert paths != null;
        for (File file:paths){
            Scanner reader=new Scanner(file);

            while (reader.hasNextLine()){
                String[] data=reader.nextLine().split("-");
                System.out.println(data);
                SanPham sanPham=null;
                if(file.toString().contains("BangDia")){
                    sanPham=new BangDia(data);
                }else if(file.toString().contains("Sach")){
                    sanPham=new Sach(data);
                }


                sanPhams.add(sanPham);
            }
            reader.close();
        }

    }
    public void saveFileTxt(){
        new File("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh3\\Bai3SanPham\\Data\\BangDia.txt").delete();
        new File("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh3\\Bai3SanPham\\Data\\Sach.txt").delete();
        this.sanPhams.forEach(sanPham -> sanPham.saveFile());
    }

}
