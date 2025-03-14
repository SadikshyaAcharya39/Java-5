interface Animalss
{
    void eat();
}

interface Bird
{
    void fly();
}

class Sparrow implements Animalss, Bird
{
    public void eat(){
        System.out.println("Sparrow eats seeds.");
    }

    public void fly(){
        System.out.println("Sparrow can fly.");
    }
}

public class MultipleInheritanceExample
{
    public static void main(String[] args) {
       Sparrow sparrow = new Sparrow();
       sparrow.eat();
       sparrow.fly();
    }
}
