package BaiThucHanh2.Bai4HinhTron;

import BaiThucHanh2.Bai1Point.Diem;

public class MainHinhTron {
    public static void main(String[] args) {
        HinhTron hinhTron=new HinhTron(new Diem(1,1),5);
        hinhTron.disPlayCircle();
        System.out.println();
        System.out.println("Diện tích: "+hinhTron.dienTich());
        System.out.println("Chu vi: "+hinhTron.chuVi());

        int viTriTuongDoi=hinhTron.pointToCirlcle(new Diem(7,8));
        if(viTriTuongDoi==0) {
            System.out.println("Nằm trên đường tròn");
        }
        else if (viTriTuongDoi==1){
            System.out.println("Nằm ngoài đường tròn");
        }
        else{
            System.out.println("Nằm trong đường tròn");
        }

        viTriTuongDoi=hinhTron.circleToCircle(new HinhTron(new Diem(2,3),4));
        if(viTriTuongDoi==0) {
            System.out.println("2 đườngtronfn tiếp xúc nhau");
        }
        else if (viTriTuongDoi==1){
            System.out.println("2 đường tròn ngoài nhau");
        }
        else{
            System.out.println("2 đường tròn lồng nhau");
        }
    }
}
