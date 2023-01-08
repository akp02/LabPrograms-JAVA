package shapes;

public class Glome extends Sphere{
    Glome(double radius, String name){
        super(radius, name);
    }
    @Override
    public double getVolume() {
        return 2 * 3.14 * super.getVolume();
    }
    
}
