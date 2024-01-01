package BaiThucHanh3.Bai2;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ShapeManagers shapeManagers=new ShapeManagers();
        shapeManagers.addShape(new Circle(5),new Ellipse(3,4),new Rectangle(4,5));
        shapeManagers.addShape(new Square(7),new Triangle(3,4,5),new TriangleAB(12,3),new TriangleABC(12));
//        try {
//            shapeManagers.addShape("BaiThucHanh3.Bai2.TriangleABC");
//        } catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException |
//                 IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//
//        shapeManagers.hienThi();
        shapeManagers.addShape("BaiThucHanh3.Bai2.Circle");
//        shapeManagers.addShape("BaiThucHanh2.Bai2.Ellipse");
//        shapeManagers.addShape("BaiThucHanh2.Bai2.Circle");

        shapeManagers.sort();
        shapeManagers.hienThi();
//        System.out.println(Shape.dem);
    }
}
