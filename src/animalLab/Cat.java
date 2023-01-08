package animalLab;

public class Cat extends Animal implements Pet{
    private String name;
    Cat(String name){
        super(4);
        this.name = name;
    }
    Cat(){
        this(" ");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void play(){
        System.out.println("The cat is playing.");
    }
    public void eat(){
        System.out.println("bro cat ate");
    }
}
