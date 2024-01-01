package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class Triangle extends Shape{
    private double a,b,c;
    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        double peri =this.getPeri();
        return Math.sqrt(peri*(peri-this.a)*(peri-this.b)*(peri-this.c));
    }

    @Override
    public double getPeri() {
        return this.a+this.b+this.c;
    }
}
