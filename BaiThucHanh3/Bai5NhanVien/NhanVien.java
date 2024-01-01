package BaiThucHanh3.Bai5NhanVien;

public class NhanVien {
    private static int dem;
    private final String maSo=String.format("%05d",++dem);
    private String hoTen;
    private int soNgayCong;
    public NhanVien(String hoTen){
        this.hoTen=hoTen;
    }
    public double tinhLuong(){
        return 123000*soNgayCong;
    }
    public void dienDanh(){
        soNgayCong++;
    }

}
