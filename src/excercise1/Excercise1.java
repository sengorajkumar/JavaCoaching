package excercise1;

class Animal{

    protected String name; //why protected ? Whats the effect of declaring a variable protected?

    public String getName() { //Getter method
        return name;
    }

    public Animal(){ //Default Constructor
        this.name = "Animal";
        System.out.println("Creating animal object");
    }

    public Animal(String name){ //Constructor with one argument
        this.name = name; //What is "this"?
        System.out.println("Creating animal object, name =" + this.name);

    }

    public void run(){
        System.out.println("Animal runs!");
    }

    public void sound(){
        System.out.println("Animal makes sound!");
    }

    

}

class Dog extends Animal{

    public Dog() {
       this.name = "Dog";
       System.out.println("Creating dog object");
    }

    public Dog(String name) {
       System.out.println("Creating dog object, name = " + name);
    }

    public void run() {
        System.out.println("Dog runs!");
    }
    
    public void sound() {
        System.out.println("Dog barks!");
    }
}

public class Excercise1 {
    
    public static void main(String args []){
        Animal animal1 = new Animal();
        Dog dog1=new Dog(); // Notice the order of statements printed. Explain?
        Dog dog2=new Dog("Beagle");
        Animal dog3 = new Dog(); // What is happening here?
        animal1.run();  // Which run & sound method gets called and why?
        animal1.sound();
        dog3.run(); // Which run & sound method gets called and why?
        dog3.sound();
    }
}
