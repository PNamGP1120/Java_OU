package BaiThucHanh3.Bai1CircleInheriteEllipse;

public class Test {
    public static void main(String[] args) {
        ShapeManager shapeManager=new ShapeManager();

        Shape s1=new Ellipse(5,4);
        Shape s2=new Circle(5);
        Shape s3=new Rectangle(3,4);
        Shape s4=new Square(4);
        Shape s5=new Triangle(3,4,5);
        Shape s6=new IsoscelesTriangle(3,4);
        Shape s7=new EquilateralTriangle(5);

        shapeManager.add(s1,s2,s3,s4,s5,s6,s7);
        shapeManager.sort();
        shapeManager.disPlay();
    }
}
