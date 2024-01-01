package BaiThucHanh1.Bai1RandomNumGame;

import java.util.Random;
import java.util.Scanner;

public class Bai1RandomNumGame {
    public static void main(String[] args){
        Random random=new Random();
        int flag=random.nextInt()%10;

        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.print("Đoán số: ");
            int num = sc.nextInt();

            if (num == flag) {
                System.out.println("Chính xác!");
                break;
            } else if (num > flag) {
                System.out.println("Bạn đã nhập số lớn hơn. Nhập lại!");
            } else {
                System.out.println("Bạn đã nhập số nhỏ hơn. Nhập lai!");
            }
        }
    }
}
