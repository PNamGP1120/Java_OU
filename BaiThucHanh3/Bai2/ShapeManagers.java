package BaiThucHanh3.Bai2;

import BaiThucHanh3.Bai3SanPham.SanPham;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ShapeManagers {
    List<Shape>shapeList=new LinkedList<>();
    public void addShape(String classPate) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
//        System.out.println(this.getClass());
        Class c= Class.forName(classPate);
        Shape shape= (Shape) c.getConstructor().newInstance();
        shape.nhapSoDoCanh();
        this.shapeList.add(shape);
    }
    public void addShape(Shape shape){
        this.shapeList.add(shape);
    }
    public void addShape(Shape... shape){
        if (shape.length>3)
            return;
        this.shapeList.addAll(Arrays.asList(shape));
    }
    public void hienThi(){
        shapeList.forEach(System.out::println);
    }
    public void sort(){
        this.shapeList.sort(Shape::compared);
    }
}
