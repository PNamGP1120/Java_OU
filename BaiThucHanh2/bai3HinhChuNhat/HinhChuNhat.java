package BaiThucHanh2.bai3HinhChuNhat;

import BaiThucHanh2.Bai1Point.Diem;
import BaiThucHanh2.Bai1Point.MainPoint;

public class HinhChuNhat {
    private Diem pointTopLeft;
    private Diem pointBottomright;
    public HinhChuNhat(){
        this.pointTopLeft=new Diem(0,1);
        this.pointBottomright=new Diem(1,0);
    }

    public HinhChuNhat(Diem pointTopLeft, Diem pointBottomright) throws Exception{
        if(pointTopLeft.getHoanhDo()<pointBottomright.getHoanhDo()&&pointTopLeft.getTungDo()>pointBottomright.getTungDo()) {
            this.pointTopLeft = pointTopLeft;
            this.pointBottomright = pointBottomright;
        }
    }

    public Diem getPointTopLeft() {
        return pointTopLeft;
    }

    public void setPointTopLeft(Diem pointTopLeft) {
        this.pointTopLeft = pointTopLeft;
    }

    public Diem getPointBottomright() {
        return pointBottomright;
    }

    public void setPointBottomright(Diem pointBottomright) throws Exception {
        if(this.pointTopLeft.getHoanhDo()<pointBottomright.getHoanhDo()&&this.pointTopLeft.getTungDo()>pointBottomright.getTungDo()) {
            if(this.pointTopLeft.getHoanhDo()<this.pointBottomright.getHoanhDo()&&this.pointTopLeft.getTungDo()>this.pointBottomright.getTungDo()) {
                this.pointBottomright = pointBottomright;
            }
        }else
            throw new Exception();
    }
    public void displayHinhChuNhat(){
        System.out.printf("[(%.2f, %.2f), (%.2f , %.2f)]",pointTopLeft.getHoanhDo(),pointTopLeft.getTungDo(),pointBottomright.getHoanhDo(),pointBottomright.getTungDo());
    }
    public double dienTich(){
        return Math.abs((this.pointTopLeft.getHoanhDo() -this.pointBottomright.getHoanhDo())*(this.pointTopLeft.getTungDo()-this.pointBottomright.getTungDo()));
    }
    public double chuVi(){
        return 2*(Math.abs(this.pointTopLeft.getHoanhDo() -this.pointBottomright.getHoanhDo())+Math.abs(this.pointTopLeft.getTungDo()-this.pointBottomright.getTungDo()));
    }
}
