package BaiThucHanh4.Bai4;

public class Rectangle implements Movable{
    private Point2D point2D;
    private double chieuDai,chieuRong;
    public Rectangle(Point2D point2D, double chieuDai,double chieuRong){
        this.point2D=point2D;
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
