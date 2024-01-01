package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class Square extends Rectangle {
    public Square(double canh){
        super(canh,canh);
    }

    @Override
    public String getName() {
        return "Square";
    }

}
