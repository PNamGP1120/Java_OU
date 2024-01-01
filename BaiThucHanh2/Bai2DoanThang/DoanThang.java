package BaiThucHanh2.Bai2DoanThang;

import BaiThucHanh2.Bai1Point.Diem;

public class DoanThang {
    private Diem diem1;
    private Diem diem2;
    public DoanThang(){
        this.diem1=new Diem();
        this.diem2=new Diem();
    }
    public DoanThang(Diem diem1,Diem diem2){
        this.diem1=diem1;
        this.diem2=diem2;
    };
    public void setDiem1(Diem diem){
        this.diem1=diem;
    }
    public void setDiem2(Diem diem){
        this.diem2=diem;
    }
    public Diem getDiem1(){
        return diem1;
    }
    public Diem getDiem2(){
        return diem2;
    }
    public void displayDoanThang(){
        System.out.printf("[(%.2f, %.2f), (%.2f , %.2f)]",diem1.getHoanhDo(),diem1.getTungDo(),diem2.getHoanhDo(),diem2.getTungDo());
    }
    public double distance2Point(){
        return diem1.distance(diem2);
    }
    public Diem trungDiem(){
        return new Diem((diem1.getHoanhDo()+diem2.getHoanhDo())/2,(diem1.getTungDo()+diem2.getTungDo())/2);
    }
    public boolean isSongSong(DoanThang doanThang){
        return (this.diem1.getHoanhDo()-this.diem2.getHoanhDo())*(doanThang.diem1.getTungDo()-doanThang.diem2.getTungDo())
                ==(doanThang.diem1.getHoanhDo()-doanThang.diem2.getHoanhDo())*(this.diem1.getTungDo()-this.diem2.getTungDo());
    }
    public Diem vectoChiPhuong(){
        return new Diem(this.diem1.getHoanhDo()-this.diem2.getHoanhDo(),this.diem1.getTungDo()-this.diem2.getTungDo());
    }
    public void viTriTuongDoi(DoanThang doanThang){
       if ((this.diem1.getHoanhDo()-this.diem2.getHoanhDo())*(doanThang.diem1.getTungDo()-doanThang.diem2.getTungDo())
                ==(doanThang.diem1.getHoanhDo()-doanThang.diem2.getHoanhDo())*(this.diem1.getTungDo()-this.diem2.getTungDo())) {
            //a(y-y0)==b(x-x0)
           Diem vecto=vectoChiPhuong();
           if(vecto.getHoanhDo()*(this.diem1.getTungDo()-doanThang.diem1.getTungDo())==vecto.getTungDo()*(this.diem1.getHoanhDo()-doanThang.diem1.getHoanhDo())) {
               System.out.println("Đoạn thẳng 1 trùng nhau với đoạn thẳng 2");
           } else {
               System.out.println("Đoạn thẳng 1 song song với đoạn thẳng 2");
           }
        } else{
            System.out.println("Đoạn thẳng 1 chéo với đoạn thẳng 2");
        }
    }
}
