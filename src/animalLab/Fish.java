package animalLab;

public class Fish extends Animal implements Pet{
    private String name;
    Fish(){
        
        super(0);
    
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    void walk(){
        System.out.println("Fish can't walk bro");
    }
    public void play(){
        System.out.println(this.name + " is playing");
    }
    public void eat(){
        System.out.println(this.name + "is eating");
    }
}
