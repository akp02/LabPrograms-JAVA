/*Write a java program that implements a multi-thread application that has three threads. 
First thread generates a random integer every 1 second and if the value is even, the second thread computes the square of the number and prints.
 If the value is odd, the third thread will print the value of the cube of the number. */
package thread1;
import java.util.Random;

public class square implements Runnable{
    int x;
    square(int x){
        this.x=x;
        }
    public void run(){
        System.out.println("Thread Name:Square Thread and Square of " + x + " is: " + x * x); 
    }
}


class cube implements Runnable{
    int x;
    cube(int x){
    this.x = x;
    }
    public void run(){
    System.out.println("Thread Name:cube Thread and cube of " + x + " is: " + x * x);
    }
}

class RandomThread implements Runnable { 
    Random r;
    Thread t2, t3;
    public void run() {
        int num;
        r = new Random();
        try {
            while (true) {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated Number is " + num); 
                if(num%2==0){
                    t2 = new Thread(new square(num)); 
                    t2.start();
                }
                else{
                    t3 = new Thread(new cube(num));
                    t3.start();
                }
                Thread.sleep(1000); 
                System.out.println("--------------------------------------"); 
            }
        } 
        catch (Exception ex) { 
            System.out.println("Interrupted Exception");
        }
    }
}

class labp1 {
    public static void main(String[] args) { 
        RandomThread thread_obj = new RandomThread(); 
        Thread t1 = new Thread(thread_obj);
        t1.start();
        }
}