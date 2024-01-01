package BaiThucHanh3.Bai2;

import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

public class TriangleABC extends TriangleAB {
	public TriangleABC(){}
	public TriangleABC(double abc) {
		super(abc,abc);
	}

	@Override
	public String getShapeName() {
		return "TriangleABC";
	}

	@Override
	public void nhapSoDoCanh() {
		System.out.print("Nhập số đo cạnh: ");
		double abc=Double.parseDouble(CauHinh.scanner.nextLine());
		this.setA(abc);
		this.setB(abc);
		this.setC(abc);
	}
}
