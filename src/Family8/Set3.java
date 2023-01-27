package Family8;
/*8. A. Create a base class called Father and a derived class called Son which extends the base class.
 In Father class, implement a constructor which takes the age and throws the user defined exception WrongAge( ) when the input age<0. 
In Son class, implement a constructor that checks both father and son’s age and throws an using defined exception AgeInvalid( ) if son’s age is >=father’s age. */
class WrongAge extends Exception {
    public String toString()
    {
        return "Please enter the right age:"; 
    }
}
class Father
{
    int age;
    Father(int age1)
    {
        age=age1;
        System.out.println("Father age:"+age);
    }
}
class Son extends Father
{
    Son(int age1)
    {
        super(age1);
        System.out.println("Son age:"+age);
    }
}
class Set3
{       
    public static void main(String args[]) throws WrongAge {
        int i=args.length;
        int j=Integer.parseInt(args[0]); // give arguments as father age and then son age
        int k=Integer.parseInt(args[1]); 
        if(i<=0 || j<=k){
            throw new WrongAge();
        }
        else{
            Father f=new Father(j);
            Son s=new Son(k);
        }
    }
}
