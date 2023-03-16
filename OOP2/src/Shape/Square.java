package Shape;

public class Square extends Shape {
    private double width;
    public double getChuVi(){
        return width*4;
    }
    public double getDienTich(){
        return width*width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Square(double width) {
        this.width = width;
    }
}
