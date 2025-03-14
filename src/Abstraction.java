abstract class Animal
{
    abstract void makeSound();

}

class Dog extends Animal
{
    void makeSound(){
        System.out.println("Barkkk!!!");
    }
}

public class Abstraction
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
