package BaiThucHanh2.Bai4HinhTron;

import BaiThucHanh2.Bai1Point.Diem;

public class HinhTron {
    private static final double epsilon=0.0001;
    private Diem centerPoint;
    private double radius;

    public HinhTron(){
        this.centerPoint = new Diem(0,0);
        this.radius = 1;
    }

    public HinhTron(Diem centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public Diem getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Diem centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            return;
        }
        this.radius = radius;
    }

    public void disPlayCircle(){
        System.out.printf("O((%f, %f), %f)",this.centerPoint.getHoanhDo(),this.centerPoint.getTungDo(),this.radius);
    }
    public double dienTich(){
        return Math.PI*this.radius*this.radius;
    }
    public double chuVi(){
        return Math.PI*2*this.radius;
    }

    public int pointToCirlcle(Diem diem){
        double distance=this.centerPoint.distance(diem);
        if(distance<radius+epsilon&&distance>radius-epsilon){
            return 0;
        }else if(distance>this.radius){
            return 1;
        }else {
            return -1;
        }
    }
    public int circleToCircle(HinhTron hinhTron){
        double distance=this.centerPoint.distance(hinhTron.centerPoint);
        if(distance<this.radius+hinhTron.radius+epsilon&&distance>this.radius+hinhTron.radius-epsilon){
            return 0;
        } else if (distance>this.radius+hinhTron.radius) {
            return 1;
        }else{
            return -1;
        }
    }
}
