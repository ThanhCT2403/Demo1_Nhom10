package Shape;

public class Circle extends Shape {
    private double radius;
    public double getChuVi(){
        return radius*2*3.14;
    }
    public double getDienTich(){
        return radius*radius*3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
