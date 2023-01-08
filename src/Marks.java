/*3. A. We have to calculate the percentage of marks obtained in three subjects (each
out of 100) by student A and in four subjects (each out of 100) by student B.
Create an abstract class &#39;Marks&#39; with an abstract method &#39;getPercentage&#39;. 
It is inherited by two other classes &#39;A&#39; and &#39;B&#39; each having a method with the same

name which returns the percentage of the students. The constructor of student A
takes the marks in three subjects as its parameters and the marks in four
subjects as its parameters for student 

B. Create an object for each of the two
classes and print the percentage of marks for both the students. */
public abstract class Marks {
    public abstract double getPercentage();
}
class A extends Marks{
    private int s1, s2, s3;
    public A(int m1, int m2, int m3){
        this.s1 = m1;
        this.s2 = m2;
        this.s3 = m3;
    }
    public double getPercentage(){
        return (s1+s2+s3)/300.0;
    }
}

class B extends Marks{
    private int s1, s2, s3, s4;
    public B(int m1, int m2, int m3, int m4){
        this.s1 = m1;
        this.s2 = m2;
        this.s3 = m3;
        this.s4 = m4;
    }
    public double getPercentage(){
        return (s1+s2+s3+s4)/400.0;
    }
}

class student{
    public static void main(String[] args) {
        A student1 = new A(50, 60, 99);
        B student2 = new B(99, 98, 97, 96);
        double p1 = student1.getPercentage();
        double p2 = student2.getPercentage();
        System.out.println("The student 1 precentage: " + p1);
        System.out.println("The student 2 precentage: " + p2);
    }
}
