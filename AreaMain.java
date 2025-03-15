abstract class Shape {
    // Define common properties
    int length = 10;
    int breadth = 20;
    int height = 30;

    // Abstract method that must be implemented by subclasses
    abstract void calculateArea();
}

interface CalculateArea {
    void calculateArea();
}

class AreaOfRectangle extends Shape implements CalculateArea {
    @Override
    public void calculateArea() {
        int areaOfRectangle = length * breadth;
        System.out.println(areaOfRectangle);
    }
}

class AreaOfSquare extends Shape implements CalculateArea {
    public void calculateArea(){
       int areaOfSquare = length * length;
        System.out.println(areaOfSquare);
    }
}

public class AreaMain
{
    public static void main(String[] args) {
     AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
     areaOfRectangle.calculateArea();

     AreaOfSquare areaOfSquare = new AreaOfSquare();
     areaOfSquare.calculateArea();

    }
}
