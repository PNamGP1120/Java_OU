package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class Ellipse extends Shape {
    private double bkTrucLon;
    private double bkTrucNho;

    public Ellipse(double bkTrucLon, double bkTrucNho){
        this.bkTrucLon=bkTrucLon;
        this.bkTrucNho=bkTrucNho;
    }

    @Override
    public String getName() {
        return "Ellipse";
    }

    @Override
    public double getArea() {
        return Math.PI*this.bkTrucLon*this.bkTrucNho;
    }

    @Override
    public double getPeri() {
        return 2*Math.PI*Math.sqrt((Math.pow(this.bkTrucLon,2)+Math.pow(this.bkTrucNho,2))/2);
    }


}
