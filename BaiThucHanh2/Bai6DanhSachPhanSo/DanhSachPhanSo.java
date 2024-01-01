package BaiThucHanh2.Bai6DanhSachPhanSo;

import BaiThucHanh2.Bai5PhanSo.PhanSo;

import java.util.ArrayList;
import java.util.Arrays;

public class DanhSachPhanSo {
    private ArrayList<PhanSo> phanSoArrayList=new ArrayList<PhanSo>();

    public void addPhanSo(PhanSo phanSo){
        this.phanSoArrayList.add(phanSo);
    }
    public void addPhanSo(PhanSo... phanSos){
        this.phanSoArrayList.addAll(Arrays.asList(phanSos));
    }

    public void addPhanSo(){
        PhanSo phanSo=new PhanSo();
        phanSo.nhapPhanSo();
        this.phanSoArrayList.add(phanSo);
    }
    public void hienThi(){
        for(PhanSo phanSo:phanSoArrayList){
            phanSo.displayPhanSo();
            System.out.println();
        }

    }
    public PhanSo tongPhanSos(){
        return this.phanSoArrayList.stream().reduce(new PhanSo(),(t,x)->t.congPhanSo(x));
    }
    public PhanSo timMax(){
        return this.phanSoArrayList.stream().max(PhanSo::comparePhanSo).get();
    }
    public PhanSo timMin(){
        return this.phanSoArrayList.stream().min((a,b)->a.comparePhanSo(b)).get();
    }

    public void sort(){
        this.phanSoArrayList.sort((a,b)->a.comparePhanSo(b));
    }

    public void remove(PhanSo phanSo){
        this.phanSoArrayList.removeIf(p->p.comparePhanSo(phanSo)==0);
    }
    public void remove(int tuSo, int mauSo){
        this.phanSoArrayList.removeIf(p->p.comparePhanSo(new PhanSo(tuSo,mauSo))==0);
    }
    public void remove(PhanSo... phanSos){
        for(PhanSo phanSo:phanSos){
            this.phanSoArrayList.removeIf(p->p.comparePhanSo(phanSo)==0);
        }

    }
}
