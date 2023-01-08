package shapes;

public class Square extends Shape implements Area{
    double side;
    Square(double s, String n){
        super(n);
        this.side = s;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
