package BaiThucHanh4.Bai1hinh;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class QLhinh {
    private List<Hinh>dsHinh=new LinkedList<>();
    public void themHinh(Hinh...hinhs){
        this.dsHinh.addAll(Arrays.asList(hinhs));
    }

    public void xoaHinh(String tenHinh){
        this.dsHinh.removeIf(hinh -> hinh.getTenHinh().equals(tenHinh));
    }
    public void hienThi(){
        this.dsHinh.forEach(System.out::print);
    }
    public List<Hinh>layMotLoaiHinh(String classPate) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c=Class.forName(classPate);
//        Hinh hinh1=(Hinh) c.getConstructor().newInstance();
        return this.dsHinh.stream().filter(c::isInstance).toList();
    }
    public void sort(int flag){
        this.dsHinh.sort((hinh1,hinh2)-> flag*Double.compare(hinh1.tinhDienTich(), hinh2.tinhDienTich()));
    }
    public void sort(){
        this.dsHinh.sort(Comparator.comparing(Hinh::getTenHinh).thenComparing(Hinh::getDienTich,Comparator.reverseOrder()));
//        this.dsHinh.sort((hinh1,hinh2)->{
//            int flag = hinh1.getTenHinh().compareTo(hinh2.getTenHinh());
//            if(flag>0) return 1;
//            else if (flag < 0) {
//                return -1;
//            }
//            else{
//                return -Double.compare(hinh1.tinhDienTich(), hinh2.tinhDienTich());
//            }
//        });
    }

    public double tinhDienTichTrungBinh(){
        double sum=0;
        for(Hinh hinh:this.dsHinh){
            sum+=hinh.tinhDienTich();
        }
        return sum/this.dsHinh.size();
    }

    public int timHinh(Hinh h){
        return this.dsHinh.indexOf(h);
    }
}
