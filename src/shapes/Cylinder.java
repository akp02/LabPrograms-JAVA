package shapes;

public class Cylinder extends Circle implements Volume{
    private double height;
    Cylinder(double h, double r, String n){
        super(r,n);
        this.height = h;
    }
    @Override
    public double getVolume() {
        double area = super.getArea();
        return area * height;
    }
}
