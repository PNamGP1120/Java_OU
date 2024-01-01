package BaiThucHanh3.Bai3SPAbstract;

import java.time.LocalDate;

public enum KyHan {
    MOT_TUAN(0.05,7){
        @Override
        public LocalDate tinhNgayDaoHan(LocalDate date) {
            return date.plusDays(7);
        }
    },
    MOT_THANG(0.045,1){
        @Override
        public LocalDate tinhNgayDaoHan(LocalDate date) {
            return date.plusMonths(1);
        }
    },
    MOT_NAM(0.068,1){
        @Override
        public LocalDate tinhNgayDaoHan(LocalDate date) {
            return date.plusYears(1);
        }
    };
    protected final double laiSuat;
    protected final int khoangThoiGian;
    KyHan(double laiSuat, int khoangThoiGian){
        this.laiSuat=laiSuat;
        this.khoangThoiGian=khoangThoiGian;
    }
    public abstract LocalDate tinhNgayDaoHan(LocalDate date);
    public double tinhLai(double soTien) {
        return soTien*this.laiSuat;
    }
}
