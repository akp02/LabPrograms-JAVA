package shapes;

public class Sphere extends Circle implements Volume{
    Sphere(double r, String n){
        super(r,n);
    }
    @Override
    public double getVolume() {
        return this.getArea() * radius;
    }
}
