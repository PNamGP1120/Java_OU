package BaiThucHanh4.Bai1hinh;

public class TamGiac extends Hinh{
    private double a,b,c;
    public TamGiac(String tenHinh, double a, double b, double c){
        super(tenHinh);
        this.a=a;this.b=b;this.c=c;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        TamGiac hinh=(TamGiac) obj;
        return this.a==hinh.a&&this.b==hinh.b&&this.c==hinh.c;
    }
    @Override
    public double tinhDienTich() {
        double peri =this.tinhChuVi();
        return Math.sqrt(peri*(peri-this.a)*(peri-this.b)*(peri-this.c));
    }

    @Override
    public double tinhChuVi() {
        return this.a+this.b+this.c;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
