package animalLab;

public class Cat extends Animal{
    private String name;
    Cat(String name){
        super(4);
        this.name = name;
    }
    Cat(){
        this(" ");
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void play(){
        System.out.println("The cat is playing.");
    }
    public void eat(){
        System.out.println("bro cat ate");
    }
}
