/*Create class Number with only one private instance variable as a double
primitive type. To include the following methods (include respective
constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(),
isAmstrong() the above methods return boolean primitive type. getFactorial(),
getSqrt(), getSqr(), sumDigits(), getReverse() the above methods return double
primitive type. Write the driver class for main method which invokes each
method using object. */
public class Number {
    private double num;
    Number(int n){
        this.num = n;
    }
    boolean isZero(){
        if (this.num == 0) {
            return true;
        }
        return false;
    }
    boolean isPositive(){
        if (this.num > 0) {
            return true;
        }
        return false;
    }
    boolean isNegative(){
        if (this.num<0) {
            return true;
        }
        return false;
    }
    boolean isOdd(){
        if(this.num % 2 != 0){
            return true;
        }
        return false;
    }
    boolean isEven(){
        if (this.num % 2 == 0) {
            return true;
        }
        return false;
    }
    boolean isPrime(){
        if (this.num <= 1) {
            return false;
        }
        if (this.num == 2 || this.num ==3) {
            return true;
        }
        if (this.num % 2 == 0 || this.num % 3 == 0) {
            return false;
        }

        for(int i = 5; i < Math.sqrt(this.num); i += 6){
            if (this.num % i == 0 || this.num % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
    boolean isArmstrong(){
        int n = (int)this.num;
        int sum = 0;
        while (n > 0) {
            int r = n%10;
            sum += (r*r*r);
            n = n/10;
        }
        if (sum == this.num) {
            return true;
        }
        return false;
    }
    
}
/**
 * InnerNumber
 */
class InnerNumber {
    public static void main(String[] args) {
        Number n1 = new Number(153);
        if(n1.isPositive()){
            System.out.println("number is positive");
        }
        if(n1.isOdd()){
            System.out.println("number is odd");
        }
        if(n1.isPrime()){
            System.out.println("number is prime");
        }
        if(n1.isEven()){
            System.out.println("number is even");
        }
        if(n1.isNegative()){
            System.out.println("number is negative");
        }
        if (n1.isArmstrong()) {
            System.out.println("Number is Armstrong number");
        }

    }
}
