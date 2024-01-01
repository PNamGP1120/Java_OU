package BaiThucHanh2.Bai7TrungTamGiaSu;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.DoubleStream;

public class HocVien {
    private static int count=0;
    private final int maHocVien=++count;
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;
    private double[] diem;
    private double gpa;


    //getter
    public int getMaHocVien(){
        return this.maHocVien;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public LocalDate getNgaySinh(){
        return this.ngaySinh;
    }
    public String getQueQuan(){
        return this.queQuan;
    }
    public double[] getDiem() {
        return diem;
    }
    public double getGpa() {
        return gpa;
    }

    //setter
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public void setQueQuan(String queQuan){
        this.queQuan=queQuan;
    }
    public void setNgaySinh(LocalDate ngaySinh){
        this.ngaySinh=ngaySinh;
    }
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //constructor
    public HocVien(){
    }
    public HocVien(String hoTen, LocalDate ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
    public HocVien(String hoTen,String ngaySinh, String queQuan){
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER));
        this.queQuan = queQuan;
    }

    public void inputTongTinHocVien() throws ParseException {
        System.out.print("Nhập họ và tên: ");
        this.hoTen=CauHinh.scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        this.queQuan=CauHinh.scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        this.ngaySinh=LocalDate.parse(CauHinh.scanner.nextLine(),DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER));
    }

    public void inputDiemHocVien(){
        diem=new double[CauHinh.SO_MON];
        for(int i=0;i<CauHinh.SO_MON;i++){
            System.out.printf("Nhập môn thứ %d: ",i+1);
            diem[i]=Double.parseDouble(CauHinh.scanner.nextLine());
        }
        this.gpa = DoubleStream.of(this.diem).average().getAsDouble();
    }
    public void displayHocVien(){
        System.out.printf("| %-7s| %-25s| %-12s| %-12s|\n",
                this.maHocVien,this.hoTen,this.ngaySinh.format(DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER)),this.queQuan);
    }
    public void disPlayDiem(){
        System.out.printf("| %-7s| %-25s| %-12s| %-12s| %-7.2f| %-7.2f| %-7.2f| %-7.2f|\n",
                this.maHocVien,this.hoTen,this.ngaySinh.format(DateTimeFormatter.ofPattern(CauHinh.DATE_FORMATTER)),this.queQuan,
                this.diem[0],this.diem[1],this.diem[2],this.gpa);

    }
    public boolean isHocBong(){
        for(double d:diem){
            if(d<5)
                return false;
        }
        return this.gpa >=8;
    }

    public int isGpaLonHon(HocVien hocVien){
        if(this.gpa>hocVien.getGpa()){
            return 1;
        }else if(this.gpa<hocVien.getGpa()){
            return -1;
        }
        return 0;
    }
}
