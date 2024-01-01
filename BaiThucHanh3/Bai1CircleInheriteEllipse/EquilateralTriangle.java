package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(double abc){
        super(abc,abc);
    }

    @Override
    public String getName() {
        return "Equilateral Triagle";
    }
}
