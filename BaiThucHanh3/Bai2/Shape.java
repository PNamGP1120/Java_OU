package BaiThucHanh3.Bai2;

public abstract class Shape {
	public static int dem=0;
	private final int id=++dem;

	public abstract double tinhDienTich();

	public abstract double tinhChuVi();
	public abstract String getShapeName();
	public abstract void nhapSoDoCanh();
	public int compared(Shape shape){
		return Double.compare(this.tinhDienTich(),shape.tinhDienTich());
	}

	public String toString() {
		return String.format("Hình %s %d\n - Diện tích: %.2f\n - Chu vi: %.2f\n",getShapeName(),this.id,tinhDienTich(),tinhChuVi());
	}

}
