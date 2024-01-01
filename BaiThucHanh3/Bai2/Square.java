package BaiThucHanh3.Bai2;

import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

public class Square extends Rectangle {
	public Square(){}
	public Square(double canh) {
		super(canh,canh);
	}

	@Override
	public String getShapeName() {
		return "Square";
	}

	@Override
	public void nhapSoDoCanh() {
		System.out.print("Nhập cạnh: ");
		double canh = Double.parseDouble(CauHinh.scanner.nextLine());
		this.setChieuDai(canh);
		this.setChieuRong(canh);
	}
}
