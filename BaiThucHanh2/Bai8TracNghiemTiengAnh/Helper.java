package BaiThucHanh2.Bai8TracNghiemTiengAnh;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Helper {
    public static void menuMain(){
        System.out.println("Lựa chọn");
        System.out.println("1. Thêm câu hỏi vào tập tin UUID.txt trong thư mục CauHoi");
        System.out.println("2. Luyện thi trắc nghiệm tiếng anh");
        System.out.println("3. Thoát chương trình");
        System.out.print("    --> ");
    }

    static void themCauHoiVaoFolder() throws IOException {
        boolean flagMain=true;
        while (flagMain){
            String path=String.format("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai8TracNghiemTiengAnh\\CauHoiTracNghiem\\%s", UUID.randomUUID());
            File file=new File(path);
            file.createNewFile();

            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            CauHoi cauHoi=new CauHoi();
            cauHoi.nhapCauHoi();

            bufferedWriter.write(cauHoi.castToString());
            bufferedWriter.close();
            fileWriter.close();

            System.out.print("Bạn có tiếp tục nhập hay không (1/0): ");
            if(new Scanner(System.in).nextLine().equals("0")){
                flagMain=false;
            }
        }
    }


    static void luyenThiTiengAnh() throws IOException {
        File dir=new File("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai8TracNghiemTiengAnh\\CauHoiTracNghiem");
        String[] str=dir.list();
        assert str != null;
        ArrayList<String> arrCauHoi = new ArrayList<>(Arrays.asList(str));

        System.out.print("Nhập số lượng câu hỏi: ");
        int soCauHoi=0;
        do{
            soCauHoi=new Scanner(System.in).nextInt();
            if(soCauHoi>str.length){
                System.out.print("Số lượng câu hỏi hiện tại chỉ là: "+str.length);
                System.out.print("Nhập lại số lượng câu hỏi: ");
            }
        }while(soCauHoi>str.length);

        int flagDiem=0;
        for(int i=0;i<soCauHoi;i++){
            System.out.println("\nCâu hỏi thứ "+(i+1));
            int ranCauhoi=(int)(Math.random()*arrCauHoi.size());
            String strPathFile=String.format("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai8TracNghiemTiengAnh\\CauHoiTracNghiem\\%s",arrCauHoi.get(ranCauhoi));
//            File file=new File(strPathFile);
//            System.out.print(strPathFile);


            CauHoi cauHoi=docFileCauHoi(strPathFile);

            cauHoi.hienThiCauHoi();
            System.out.print("Nhập đán án của bạn: ");
            char danAn=new Scanner(System.in).nextLine().charAt(0);

            if(danAn==cauHoi.getdapAn()){
                System.out.println("Chính xác");
                flagDiem++;
            }else{
                System.out.println("Đán án sai");
                break;
            }
            arrCauHoi.remove(ranCauhoi);
        }

        System.out.printf("Chúc mừng bạn đã hoàn thành %s câu hỏi",flagDiem);
    }

    private static CauHoi docFileCauHoi(String file) throws IOException {
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String noiDungCauHoi=bufferedReader.readLine();
        String dapAnA=bufferedReader.readLine();
        String dapAnB=bufferedReader.readLine();
        String dapAnC=bufferedReader.readLine();
        String danAnD=bufferedReader.readLine();
        String dapAn=bufferedReader.readLine();

        return new CauHoi(noiDungCauHoi,dapAnA,dapAnB,dapAnC,danAnD,dapAn.charAt(0));

    }
}
