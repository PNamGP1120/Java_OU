package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class Circle extends Ellipse{
    public Circle(double bk){
        super(bk,bk);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
