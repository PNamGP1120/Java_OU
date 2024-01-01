package BaiThucHanh2.bai3HinhChuNhat;

import BaiThucHanh2.Bai1Point.Diem;
import BaiThucHanh2.Bai2DoanThang.DoanThang;

public class HCN2 extends DoanThang {
    public HCN2(Diem diem1, Diem diem2) {
        super(diem1, diem2);
    }
    public double dienTich(){
        return Math.abs((this.getDiem1().getHoanhDo() -this.getDiem2().getHoanhDo())*(this.getDiem1().getTungDo()-this.getDiem2().getTungDo()));
    }
    public double chuVi(){
        return 2*(Math.abs(this.getDiem1().getHoanhDo() -this.getDiem2().getHoanhDo())+Math.abs(this.getDiem1().getTungDo()-this.getDiem2().getTungDo()));
    }
}
