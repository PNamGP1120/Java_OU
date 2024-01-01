package BaiThucHanh2.Bai5PhanSo;

import java.util.ArrayList;

public class MainPhanSo {
    public static void main(String[] args) {
        ArrayList<PhanSo>phanSos=new ArrayList<PhanSo>();
        for(int i=0;i<7;i++){
            phanSos.add(new PhanSo((int) (Math.random()*25),25));
        }
        PhanSo sumPhanSo=new PhanSo();
        PhanSo hieuPhanSo=new PhanSo();
        PhanSo tichPhanSo=new PhanSo();
//        PhanSo thuongPhanSo=new PhanSo();

        PhanSo phanSoMax=new PhanSo();
        for(PhanSo phanSo:phanSos){
            phanSo.rutGon();
            phanSo.displayPhanSo();

            System.out.print("\t");
            sumPhanSo=sumPhanSo.congPhanSo(phanSo);
            sumPhanSo.rutGon();
            sumPhanSo.displayPhanSo();

            System.out.print("\t");
            hieuPhanSo=hieuPhanSo.truPhanSo(phanSo);
            hieuPhanSo.rutGon();
            hieuPhanSo.displayPhanSo();

            System.out.print("\t");
            tichPhanSo=tichPhanSo.nhanPhanSo(phanSo);
            tichPhanSo.rutGon();
            tichPhanSo.displayPhanSo();


            System.out.println();

            if(phanSoMax.comparePhanSo(phanSo)==-1){
                phanSoMax.setTuSo(phanSo.getTuSo());
                phanSoMax.setMauSo(phanSo.getMauSo());
                phanSo.rutGon();
            }
        }
        System.out.print("Tổng các phân số: ");
        sumPhanSo.displayPhanSo();

        System.out.print("\nPhân số so sánh: ");
        PhanSo phanSo2=new PhanSo(4,1);
        phanSo2.displayPhanSo();

        System.out.print("\nSo sánh tổng các phân số của mảng và phân số mới: ");

        int flag=sumPhanSo.comparePhanSo(phanSo2);
        if(flag==1){
            System.out.println("Lớn hơn");
        } else if (flag==0) {
            System.out.println("Bằng nhau");
        } else{
            System.out.println("Nhỏ hơn");
        }
        System.out.println("Phân số lớn nhất: ");
        phanSoMax.displayPhanSo();



//        PhanSo phanSo=new PhanSo(0,12);
//        phanSo.rutGon();
//        phanSo.displayPhanSo();
    }
}
