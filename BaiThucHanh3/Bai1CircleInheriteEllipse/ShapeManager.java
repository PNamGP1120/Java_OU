package BaiThucHanh3.Bai1CircleInheriteEllipse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeManager {
    private final List<Shape>shapes=new ArrayList<>();

    public void add(Shape... shape){
        this.shapes.addAll(Arrays.stream(shape).toList());
    }
    public void disPlay(){
        this.shapes.forEach(System.out::println);
    }

    public void sort(){
        this.shapes.sort((s1,s2)->{
            if(s1.getArea()>s2.getArea())
                return 1;
            else if (s1.getArea()<s2.getArea())
                return -1;
            else {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }
    public Shape findMax(){
        return this.shapes.stream().max((s1,s2)->Double.compare(s1.getArea(),s2.getArea())).get();
    }
}
