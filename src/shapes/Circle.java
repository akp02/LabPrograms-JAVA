package shapes;

public class Circle extends Shape implements Area{
    double radius;
    public Circle(double r, String n){
        super(n);
        radius = r;
    }
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

}
