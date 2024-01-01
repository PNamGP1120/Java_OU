package BaiThucHanh3.Bai2;

import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

import javax.swing.plaf.IconUIResource;

public class Circle extends Ellipse {
	public Circle(){}
	public Circle(double bk) {
		super(bk,bk);
	}

	@Override
	public String getShapeName() {
		return "Circle";
	}

	@Override
	public void nhapSoDoCanh() {
		System.out.print("Nhập bán kính: ");
		double bk = Double.parseDouble(CauHinh.scanner.nextLine());
		this.setBkTrucLon(bk);
		this.setBkTrucNho(bk);
	}

}
