abstract class Area{
    abstract void areaOfRectangle(int length, int breadth);
}

class Rectangle extends Area {
     public void areaOfRectangle(int length, int breadth){
         int area = length * breadth;
         System.out.println("Length: " + length + " Breadth: " + breadth);
         System.out.println("Area of Rectangle: " + area);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.areaOfRectangle(20, 10);

    }
}
