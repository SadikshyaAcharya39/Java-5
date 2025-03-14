interface Animals
{
     public void animalSound();
    public void sleep();

}

class Pig implements Animals
{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }

    public void sleep(){
        System.out.println("Zzz");
    }
}
