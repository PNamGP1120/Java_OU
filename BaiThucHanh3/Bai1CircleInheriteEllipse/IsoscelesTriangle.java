package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class IsoscelesTriangle extends Triangle{
    public IsoscelesTriangle(double ab, double c){
        super(ab,ab,c);
    }

    @Override
    public String getName() {
        return "Isosceles Triangle";
    }
}
