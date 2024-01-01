package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class Rectangle extends Shape{
    private double chieuDai;
    private double chieuRong;
    public Rectangle(double chieuDai,double chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return this.chieuDai*this.chieuRong;
    }

    @Override
    public double getPeri() {
        return 2*(this.chieuRong+this.chieuDai);
    }
}
