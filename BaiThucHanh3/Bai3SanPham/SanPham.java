package BaiThucHanh3.Bai3SanPham;

import java.io.FileWriter;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class SanPham {
    public static Scanner scanner=new Scanner(System.in);
    private String maSanPham;
    private String tenSanPham;
    private String moTaSanPham;
    private String nhaSanXuat;
    private double giaBan;
    public SanPham(){
    }
    public SanPham(String maSanPham,String tenSanPham,String moTaSanPham,String nhaSanXuat,double giaBan){
        this.maSanPham=maSanPham;
        this.tenSanPham=tenSanPham;
        this.moTaSanPham=moTaSanPham;
        this.nhaSanXuat=nhaSanXuat;
        this.giaBan=giaBan;
    }
    public SanPham(String[]args){
        this(args[0],args[1],args[2],args[3],Double.parseDouble(args[4]));
    }


    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void nhapSanPham(){
        System.out.print("Nhập mã SP: ");this.maSanPham=scanner.nextLine();
        System.out.print("Nhập tên SP: ");this.tenSanPham=scanner.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");this.moTaSanPham=scanner.nextLine();
        System.out.print("Nhập nhà sản xuất: ");this.nhaSanXuat=scanner.nextLine();
        System.out.print("Nhập giá bán: ");this.giaBan=Double.parseDouble(scanner.nextLine());
    }
    public void hienThi(){
        System.out.printf("Mã SP: %s\n",this.maSanPham);
        System.out.printf("Tên SP: %s\n",this.tenSanPham);
        System.out.printf("Mô tả SP: %s\n",this.moTaSanPham);
        System.out.printf("Nhà SX: %s\n",this.nhaSanXuat);
        System.out.printf("Gia bán: %.2f\n",this.giaBan);
    }

    public int compared(SanPham sanPham){
        return Double.compare(this.giaBan, sanPham.giaBan);
    }
    public String stringForFile(){
        return String.format("%s-%s-%s-%s-%.2f",this.maSanPham,this.tenSanPham,this.moTaSanPham,this.nhaSanXuat,this.giaBan);
    }
    public void saveFile(){

    }

}
