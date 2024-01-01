package BaiThucHanh2.Bai8TracNghiemTiengAnh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class text {
    public static void main(String[] args) throws IOException {

        String strPathFile=String.format("C:\\Users\\ADMIN\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai8TracNghiemTiengAnh\\CauHoiTracNghiem\\%s","5e948a6c-3d9a-4105-8444-986a748fa796");
        FileReader fileReader=new FileReader(strPathFile);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String noiDungCauHoi=bufferedReader.readLine();
        String dapAnA=bufferedReader.readLine();
        String dapAnB=bufferedReader.readLine();
        String dapAnC=bufferedReader.readLine();
        String danAnD=bufferedReader.readLine();
        String dapAn=bufferedReader.readLine();

        bufferedReader.close();

        CauHoi cauHoi= new CauHoi(noiDungCauHoi,dapAnA,dapAnB,dapAnC,danAnD,dapAn.charAt(0));
        cauHoi.hienThiCauHoi();
    }
}
