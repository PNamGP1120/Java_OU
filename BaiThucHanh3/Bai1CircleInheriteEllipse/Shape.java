package BaiThucHanh3.Bai1CircleInheriteEllipse;

public abstract class Shape {
    public Shape(){}
    public double getArea(){
        return 0;
    }
    public double getPeri(){
        return 0;
    }
    public String getName(){
        return "Shape";
    }

    public String toString(){
        return String.format("Hình %s\n\tDiện tích: %.2f\n\tChu vi: %.2f",
                this.getName(),this.getArea(),this.getPeri());
    }
}
