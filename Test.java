import java.util.*;
public class Shape {
    public int calculateArea() {
        
    }


    public void displayInfo() {
        System.out.println("This is a display shape.");
    }
}

public class Circle extends Shape {
     int radius;
    System.out.println("radius")
    }

    
    public int calculateArea() {
        return radius;  
    }

   
    public void displayInfo() {
        System.out.println("Circle with radius " + radius);
    }
}


public class Rectangle extends Shape {
     int width;
     int height;

    
    }
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());
    }
}
