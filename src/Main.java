
class OuterClass
{
    int x = 10;

    class InnerClass
    {
        int y = 20;
    }

}


public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.x);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.y);
    }
}