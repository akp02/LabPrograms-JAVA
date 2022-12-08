public class Car {
    private int model;
    private String make;
    private int speed;

    Car(int model, String make, int speed)
    {
        this.model = model;
        this.make = make;
        this.speed = speed;
    }
    public int getModel()
    {
        return model;
    }
    public String getMake()
    {
        return make;
    }
    public int getSpeed()
    {
        return speed;
    }

    public void accelerate()
    {
        speed = speed + 5;
    }
    public void brake()
    {
        speed = speed - 5;
    }

    public static void main(String[] args) {
        Car rari = new Car(1990, "F40", 120);
        for (int i = 0; i < 5; i++) {
            rari.accelerate();
        }      
        
        System.out.println("Speed is " + rari.getSpeed());

        for (int i = 0; i < 5; i++) {
            rari.brake();
        }
        
        System.out.println("Speed is " + rari.getSpeed());
    }
}
