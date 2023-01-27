package Family8;
/*8
B. Develop a program to check whether a given number is a Prime Number or not by creating a thread.
 Write programs using both the ways of creating threads. 
 Also justify which method of implementation is better. */
class PrimeChecker extends Thread {
    int num;
    boolean isPrime;
    PrimeChecker(int num) { this.num = num;
    }
    public void run() {
    isPrime = true;
    for (int i = 2; i <= num / 2; i++) {
    if (num % i == 0) {
        isPrime = false;
        break; 
    }
    }
    if (isPrime) {
        System.out.println(num + " is a prime number"); } else {
        System.out.println(num + " is not a prime number"); }
    } 
}
class type1 {
    public static void main(String[] args) {
        PrimeChecker pc1 = new PrimeChecker(17);
        pc1.start(); 
    }
}
