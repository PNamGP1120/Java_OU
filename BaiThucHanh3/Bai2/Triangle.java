package BaiThucHanh3.Bai2;

import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

public class Triangle extends Shape {
	private double a,b,c;
	public Triangle(){}
	public Triangle(double a, double b, double c) {
		this.a=a;this.b=b;this.c=c;
	}

	@Override
	public double tinhDienTich() {
		double nuaChuVi=this.tinhChuVi()/2;
		return Math.sqrt(nuaChuVi*(nuaChuVi-this.a)*(nuaChuVi-this.b)*(nuaChuVi-this.c));
	}

	@Override
	public double tinhChuVi() {
		return this.a+this.b+this.c;
	}

	@Override
	public String getShapeName() {
		return "Triangle";
	}

	@Override
	public void nhapSoDoCanh() {
		System.out.print("Nhập cạnh a: ");
		this.a = Double.parseDouble(CauHinh.scanner.nextLine());
		System.out.print("Nhập cạnh b: ");
		this.b = Double.parseDouble(CauHinh.scanner.nextLine());
		System.out.print("Nhập cạnh c: ");
		this.c = Double.parseDouble(CauHinh.scanner.nextLine());
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
}
