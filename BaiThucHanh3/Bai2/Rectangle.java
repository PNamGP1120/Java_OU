package BaiThucHanh3.Bai2;

import BaiThucHanh2.Bai7TrungTamGiaSu.CauHinh;

public class Rectangle extends Shape{
	private double chieuDai,chieuRong;
	public Rectangle(){}
	public Rectangle(double chieuDai,double chieuRong){
		this.chieuDai=chieuDai;this.chieuRong=chieuRong;
	}
	@Override
	public double tinhDienTich() {
		return this.chieuDai*this.chieuRong;
	}

	@Override
	public double tinhChuVi() {
		return 2*(this.chieuDai+this.chieuRong);
	}

	@Override
	public String getShapeName() {
		return "Rectangle";
	}

	@Override
	public void nhapSoDoCanh() {
		System.out.print("Nhập chiều dài: ");
		this.chieuDai= Double.parseDouble(CauHinh.scanner.nextLine());
		System.out.print("Nhập chiều rộng: ");
		this.chieuRong= Double.parseDouble(CauHinh.scanner.nextLine());
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
}
