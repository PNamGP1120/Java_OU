package TamGiac;

import java.util.InputMismatchException;

public class MainTamGiac {
    public static void main(String[] args) {
        try{
            TamGiac tg=new TamGiac(1,4,3);
            System.out.println(tg);
        }catch (InputMismatchException exception){
            System.out.println("Lỗi: "+exception.getMessage());
        }finally {
            TamGiac t1=new TamGiac(2,3,4);
            TamGiac t2=new TamGiacCan(2,3);
            TamGiac t3=new TamGiacDeu(3);

            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
        }
    }
}
