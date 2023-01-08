package animalLab;

abstract class Animal {
    protected int legs;
    protected Animal(int l){
      this.legs = l;  
    }
    abstract public void eat(); 
    void walk(){
        System.out.println("animal walks with "+legs+" legs");
    }
}
class Spider extends Animal{
    Spider(){
        super(8);
    }
    public void eat(){
        System.out.println("bro spider ate");
    }
}
/**
 * Pet
 */  

