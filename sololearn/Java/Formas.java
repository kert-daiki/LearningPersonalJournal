import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

//tu código va aquí


class Square extends Shape { 
    Square(int width) { 
        this.width = width; 
        } 
void area() { 
    System.out.println(width * width); 
        } 
    } 

class Circle extends Shape { 
    Circle(int width) { this.width = width; } 

    void area() { 

        System.out.println(Math.PI * width * width); 

        } 
    }


public class Program {

    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
