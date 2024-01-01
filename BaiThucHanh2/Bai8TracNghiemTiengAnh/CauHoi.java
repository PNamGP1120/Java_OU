package BaiThucHanh2.Bai8TracNghiemTiengAnh;

import java.util.Scanner;

public class CauHoi {
    private String cauHoi;
    private String dapAnA;
    private String dapAnB;
    private String dapAnC;
    private String dapAnD;
    private char dapAn;

    public CauHoi(String cauHoi, String dapAnA, String dapAnB, String dapAnC, String dapAnD, char dapAn){
        this.cauHoi = cauHoi;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAn = dapAn;
    }

    public CauHoi() {

    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getdapAnA() {
        return dapAnA;
    }

    public void setdapAnA(String dapAnA) {
        this.dapAnA = dapAnA;
    }

    public String getdapAnB() {
        return dapAnB;
    }

    public void setdapAnB(String dapAnB) {
        this.dapAnB = dapAnB;
    }

    public String getdapAnC() {
        return dapAnC;
    }

    public void setdapAnC(String dapAnC) {
        this.dapAnC = dapAnC;
    }

    public String getdapAnD() {
        return dapAnD;
    }

    public void setdapAnD(String dapAnD) {
        this.dapAnD = dapAnD;
    }

    public char getdapAn() {
        return dapAn;
    }

    public void setdapAn(char dapAn) {
        this.dapAn = dapAn;
    }

    public void nhapCauHoi(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập nội dung câu hỏi: ");
        this.cauHoi=scanner.nextLine();
        System.out.print("Nhập phương án A: ");
        this.dapAnA=scanner.nextLine();
        System.out.print("Nhập phương án B: ");
        this.dapAnB=scanner.nextLine();
        System.out.print("Nhập phương án C: ");
        this.dapAnC=scanner.nextLine();
        System.out.print("Nhập phương án D: ");
        this.dapAnD=scanner.nextLine();


        System.out.print("Nhập đán án: ");
        this.dapAn=scanner.nextLine().charAt(0);
    }
    public void hienThiCauHoi(){
        System.out.println("Câu hỏi: "+this.cauHoi);
        System.out.println("A. "+this.dapAnA);
        System.out.println("B. "+this.dapAnB);
        System.out.println("C. "+dapAnC);
        System.out.println("D. "+this.dapAnD);
//        System.out.println("Đán án: "+this.dapAn);
    }
    public String castToString(){
        return this.cauHoi+'\n'+this.dapAnA+'\n'+this.dapAnB+'\n'+this.dapAnC+'\n'+this.dapAnD+'\n'+this.dapAn;
    }


}
