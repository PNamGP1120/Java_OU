package BaiThucHanh2.Bai1Point;

public class MainPoint {
    public static void main(String[] args) {
        Diem diem1=new Diem(3,5);
        diem1.displayDiem();
        System.out.printf("\nKhoảng cách: %.2f",diem1.distance(new Diem(4,6)));
    }
}
