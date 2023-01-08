/* B. Write a class named Car that has the following data members:
• model. The model field is an int that holds the car’s year.
• make. The make field references a String object that holds the make of
the car.
• speed. The speed field is an int that holds the car’s current speed.
The class should have the following constructor and other methods.
• The constructor should accept the car’s year model, make and speed as
arguments.
• Accessor methods should get the values stored in an object’s year,
Model, make, and speed fields.
• Accelerate method should add 5 to the speed field each time it is called.
• Brake method should subtract 5 from the speed field each time it is
called.
Demonstrate the class in a program that creates a Car object, and then calls the
accelerate method five times. After each call to the accelerate method, get the
current speed of the car and display it. Call the brake method five times. After
each call to the brake method, get the current speed of the car and display it.*/
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
