package BaiThucHanh2.Bai5PhanSo;

import java.util.Scanner;

public class PhanSo {
    public static final Scanner scanner=new Scanner(System.in);
    private static int countPhanSo;
    private int tuSo;
    private int mauSo;
    public PhanSo(){
        this.tuSo=0;
        this.mauSo=1;
    }
    public PhanSo(int tuSo,int mauSo){
        this.tuSo=tuSo;
        this.mauSo=mauSo;
    }
    public static int uocSoChungMax(int tuSo,int mauSo){
        tuSo= Math.abs(tuSo);
        mauSo=Math.abs(mauSo);
        if (tuSo==0||mauSo==0)
            return 1;
        while (tuSo!=mauSo){
            if(tuSo>mauSo){
                tuSo-=mauSo;
            }else{
                mauSo-=tuSo;
            }
        }
        return tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public PhanSo rutGon(){
        if(this.tuSo==0){
            this.mauSo=1;
            return new PhanSo();
        }
        int ucln=uocSoChungMax(this.tuSo,this.mauSo);
        this.tuSo/=ucln;
        this.mauSo/=ucln;
        return new PhanSo(this.tuSo,this.mauSo);
    }

    public PhanSo congPhanSo(PhanSo phanSo){
        return new PhanSo(this.tuSo*phanSo.mauSo+this.mauSo*phanSo.tuSo,this.mauSo*phanSo.mauSo);
    }
    public PhanSo truPhanSo(PhanSo phanSo){
        return new PhanSo(this.tuSo*phanSo.mauSo-this.mauSo*phanSo.tuSo,this.mauSo*phanSo.mauSo);
    }
    public PhanSo nhanPhanSo(PhanSo phanSo){
        return new PhanSo(this.tuSo*phanSo.tuSo,this.mauSo*phanSo.mauSo);
    }
    public PhanSo chiaPhanSo(PhanSo phanSo){
        return new PhanSo(this.tuSo*phanSo.mauSo,this.mauSo*phanSo.tuSo);
    }
    public void displayPhanSo(){
        System.out.printf("%d / %d",this.tuSo,this.mauSo);
    }
    public int comparePhanSo(PhanSo phanSo){
        return Integer.compare(this.tuSo * phanSo.mauSo, phanSo.tuSo * this.mauSo);
//        return Integer.compare(this.tuSo * phanSo.mauSo, phanSo.tuSo * this.mauSo);
    }

    public void nhapPhanSo(){
        System.out.print("Nhập tử số: ");
        this.tuSo=scanner.nextInt();

        System.out.print("Nhập mẫu số: ");
        this.mauSo=scanner.nextInt();
    }
}
