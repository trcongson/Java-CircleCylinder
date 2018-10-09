package main;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0,"red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(6.0,"black",8.0);
        System.out.println(cylinder.toString());
    }
}
