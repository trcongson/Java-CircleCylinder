package main;

public class Cylinder extends Circle {
    private double height = 10.0;

    public Cylinder(){}

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString(){
        return "A cylinder with volume = " + getVolume() + ", which subclass is" + super.toString();
    }
}
