package BaiThucHanh1.Bai3ProcessString;

import java.util.Scanner;

public class aProcessEmail {
    public static void main(String[] args) {
        System.out.print("Nhập email: ");
        String email=new Scanner(System.in).nextLine();
        String[]name=email.split("@");
        System.out.print(name[0]);
    }
}
