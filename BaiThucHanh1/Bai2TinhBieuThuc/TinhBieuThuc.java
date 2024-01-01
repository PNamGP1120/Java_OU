package BaiThucHanh1.Bai2TinhBieuThuc;

import java.util.Scanner;

public class TinhBieuThuc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhập bậc của biểu thức: ");
        int def=sc.nextInt();

        int[] Ai=new int[def];

        for (int i=def-1;i>=0;i--){
            System.out.print("A["+i+"] = ");
            Ai[i]=sc.nextInt();
        }

        System.out.print("Biểu thức: ");
        for (int i=def-1;i>=0;i--){
            if (i!=0){
                System.out.print(Ai[i]+"x^"+i);
                System.out.print(" + ");
            }
            else{
                System.out.print(Ai[0]);
            }
        }

        System.out.print("\nNhập tham số: ");
        int x=sc.nextInt();


        int dst=0;
        for (int i=def-1;i>=0;i--){
            dst+=Ai[i] * (int)Math.pow(x,i);
        }

        System.out.print("Giá trị: "+dst);

    }
}
