package Lab_05;

import java.awt.Color;

public class Circle extends Shape {
    private int radius;

    public Circle(){

    }

    public Circle(int x, int y, int radius, Color color){
        //this.x = x; // Shape is not visible
        //this.setX(x); // workable
        //super.setX(x); // workable
        super("Circle", x, y , color);
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getDiameter(){
        return 2 * radius;
    }
    
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    //Overriding Shape.getInfo()
    public String getInfo(){
        return getName() + "(" + radius + ")";
    }


}

