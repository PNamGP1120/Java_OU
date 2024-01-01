package BaiThucHanh4.Bai1hinh;

public abstract class Hinh {
    private final String tenHinh;
    public Hinh(String tenHinh){
        this.tenHinh=tenHinh;
    }
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();

    public String toString() {
        return String.format("Hình %s - Diện tích: %.2f - Chu vi: %.2f\n",this.tenHinh,tinhDienTich(),tinhChuVi());
    }

    @Override
    public boolean equals(Object obj) {
        Hinh h=(Hinh) obj;
        return this.tenHinh.equals(h.tenHinh);
    }

    public String getTenHinh() {
        return this.tenHinh;
    }
    public double getDienTich(){
        return this.tinhDienTich();
    }
    public double getChuVi(){
        return this.tinhChuVi();
    }

}
