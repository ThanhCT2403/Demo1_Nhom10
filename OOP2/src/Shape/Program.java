package Shape;

public class Program {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape = new Rectangle(2,3);

        double chuVi =  shape.getChuVi();
        shape.getDienTich();
        System.out.println(shape.getChuVi());
        System.out.println(shape.getDienTich());

        shape = new Square(4);
        shape.getChuVi();
        shape.getDienTich();
        System.out.println(shape.getChuVi());
        System.out.println(shape.getDienTich());

        shape = new Circle(4);
        shape.getChuVi();
        shape.getDienTich();
        System.out.println(shape.getChuVi());
        System.out.println(shape.getDienTich());
    }
}
