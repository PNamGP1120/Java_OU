package BaiThucHanh2.Bai1Point;

public class Diem {
    private double hoanhDo;
    private double tungDo;
    public Diem(){
        this.hoanhDo=0;
        this.tungDo=0;
    }
    public Diem(double hoanhDo,double tungDo){
        this.hoanhDo=hoanhDo;
        this.tungDo=tungDo;
    }
    public void setHoanhDo(double hoanhDo){
        this.hoanhDo=hoanhDo;
    }
    public void setTungDo(double tungDo){
        this.tungDo=tungDo;
    }
    public double getHoanhDo(){
        return hoanhDo;
    }
    public double getTungDo(){
        return tungDo;
    }
    public void displayDiem(){
        System.out.printf("(%.2f , %.2f)",this.hoanhDo,this.tungDo);
    }
    public double distance(Diem diem){
        return Math.sqrt(Math.pow(this.hoanhDo-diem.hoanhDo,2)+Math.pow(this.tungDo-diem.tungDo,2));
    }
}
