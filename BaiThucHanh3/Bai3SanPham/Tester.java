package BaiThucHanh3.Bai3SanPham;

public class Tester {
    public static void main(String[] args) {
        QuanLySanPham quanLySanPham=new QuanLySanPham();
        String[]data1={"S1","Java","Lập trình","ĐH","50000","25"};
        String[]data2={"S2","Python","Lập trình","ĐH","60000","15"};
        String[]data3={"D1","Conan","Thám tử","KĐ","40000","37"};
        String[]data4={"D2","YaPhuc","Tình yêu","Vô hạn","0000","0000"};
        quanLySanPham.themSanPham(new Sach(data1),new BangDia(data3),new Sach(data2),new BangDia(data4));
        quanLySanPham.hienThi();
    }
}
