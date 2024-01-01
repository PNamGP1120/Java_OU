package BaiThucHanh3.Bai2;

import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

public class Ellipse extends Shape {

	private double bkTrucLon,bkTrucNho;
	public Ellipse(){}

	public Ellipse(double bkTrucLon, double bkTrucNho) {
		this.bkTrucLon=bkTrucLon;
		this.bkTrucNho=bkTrucNho;
	}
	@Override
	public double tinhDienTich() {
		return Math.PI*this.bkTrucLon*this.bkTrucNho;
	}
	@Override
	public double tinhChuVi() {
		return 2*Math.PI*Math.sqrt((Math.pow(this.bkTrucLon,2)+Math.pow(this.bkTrucNho,2))/2);
	}

	@Override
	public String getShapeName() {
		return "Ellipse";
	}

	@Override
	public void nhapSoDoCanh() {
		System.out.print("Nhập bán kính trục lớn: ");
		this.bkTrucLon= Double.parseDouble(CauHinh.scanner.nextLine());
		System.out.print("Nhập bán kính trục nhỏ: ");
		this.bkTrucNho= Double.parseDouble(CauHinh.scanner.nextLine());
	}

	public double getBkTrucLon() {
		return bkTrucLon;
	}

	public void setBkTrucLon(double bkTrucLon) {
		this.bkTrucLon = bkTrucLon;
	}

	public double getBkTrucNho() {
		return bkTrucNho;
	}

	public void setBkTrucNho(double bkTrucNho) {
		this.bkTrucNho = bkTrucNho;
	}
}
