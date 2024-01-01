package BaiThucHanh4.Bai1hinh;

public class HinhChuNhat extends Hinh{
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat(String tenHinh,double chieuDai,double chieuRong){
        super(tenHinh);
        
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        HinhChuNhat hinh=(HinhChuNhat) obj;
        return this.chieuDai==hinh.chieuDai&&this.chieuRong==hinh.chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuRong*this.chieuDai;
    }

    @Override
    public double tinhChuVi() {
        return 2*(this.chieuRong+this.chieuDai);
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return this.chieuDai;
    }

    public double getChieuRong() {
        return this.chieuRong;
    }
}
