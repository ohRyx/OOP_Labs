package Lab_05;

import java.awt.Color;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(){

    }

    public Rectangle(int x, int y, int width, int height, Color color)
    {
        super("Rectangle", x, y, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double getPerimeter(){
        return 2 * (width + height)
    }

    public double getArea(){
        return width * height;
    }

    //Overriding Shape.getInfo()
    public String getInfo(){
        return getName() + "(" + width + "," + height + ")";
    }
}
