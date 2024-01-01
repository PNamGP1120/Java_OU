package BaiThucHanh1.Bai3ProcessString;

import java.util.Scanner;

public class bDemSoChuHoa {
    public static void main(String[] args) {
        System.out.print("\n"+"Nhập chuỗi đếm kí tự Hoa: ");
        String cstring=new Scanner(System.in).nextLine();

        int nUpperCase=0;
        for (int i=0;i<cstring.length();i++){
            if(Character.isUpperCase(cstring.charAt(i))){
                nUpperCase++;
            }
        }
        System.out.println("Số kí tự hoa: "+ nUpperCase);

    }
}
