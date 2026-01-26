package methodoverriding;

public class Main {

    public static void main(String[] args){

        Animal a1 = new Animal();
        a1.sound();

        Dog d = new Dog();
        d.sound();

        Animal a = new Dog();
        a.sound();
    }
}

class Animal{

    public void sound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
