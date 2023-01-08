package shapes;

public class Cube extends Square implements Volume{
    Cube(double s, String n){
        super(s,n);
    }
    @Override
    public double getVolume() {
        return super.getArea() * side;
    }
}
