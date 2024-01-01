package BaiThucHanh3.Bai2;

import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

public class TriangleAB extends Triangle {
	public TriangleAB(){}
	public TriangleAB(double ab, double c) {
		super(ab,ab,c);
	}

	@Override
	public String getShapeName() {
		return "TriangleAB";
	}

	@Override
	public void nhapSoDoCanh() {
		System.out.print("Nhập số đo 2 cạnh bên: ");
		double ab=Double.parseDouble(CauHinh.scanner.nextLine());
		System.out.print("Nhập số đo cạnh đáy: ");
		double c=Double.parseDouble(CauHinh.scanner.nextLine());
		this.setA(ab);
		this.setB(ab);
		this.setC(c);
	}
}
