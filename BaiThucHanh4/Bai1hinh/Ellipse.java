package BaiThucHanh4.Bai1hinh;

public class Ellipse extends Hinh{
    private double trucLon;
    private double trucNho;
    public Ellipse(String tenHinh, double trucLon, double trucNho){
        super(tenHinh);
        this.trucLon=trucLon;
        this.trucNho=trucNho;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        Ellipse hinh=(Ellipse) obj;
        return this.trucLon==hinh.trucLon&&this.trucNho==hinh.trucNho;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*this.trucLon*this.trucNho;
    }

    @Override
    public double tinhChuVi() {
        return 2*Math.PI*Math.sqrt((Math.pow(this.trucLon,2)+Math.pow(this.trucNho,2))/2);
    }


    public double getTrucLon() {
        return trucLon;
    }

    public void setTrucLon(double trucLon) {
        this.trucLon = trucLon;
    }

    public double getTrucNho() {
        return trucNho;
    }

    public void setTrucNho(double trucNho) {
        this.trucNho = trucNho;
    }
}
