package TamGiac;

import java.util.InputMismatchException;

public class TamGiac {
    private double a,b,c;
    protected String getName(){
        return "thường";
    }

    public TamGiac(double a, double b, double c) {
        if(a+b>c&&b+c>a&&a+c>b) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else {
//            throw new InputMismatchException(){
//                @Override
//                public String getMessage() {
//                    return String.format("(%.1f, %.1f, %.1f) không phải ba cạnh tam giác",a,b,c);
//                }
//            };
            throw new InputMismatchException(String.format("(%.1f, %.1f, %.1f) không phải ba cạnh tam giác",a,b,c));
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double chuVi(){
        return this.a+this.b+this.c;
    }
    public double dienTich(){
        double p=this.chuVi()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


    @Override
    public String toString() {
        return String.format("Tam giác %s\n-Độ dài ba cạnh (%.1f, %.1f, %.1f)\n-Diện tích: %.2f",this.getName(),this.a,this.b,this.c, this.dienTich());
    }

}
