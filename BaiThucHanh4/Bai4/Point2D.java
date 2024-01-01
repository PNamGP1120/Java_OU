package BaiThucHanh4.Bai4;

public class Point2D implements Movable {
    private double x,y;
    public Point2D(double x, double y){
        this.x=x;this.y=y;
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)",this.x,this.y);
    }
}
