package Lab_05;

import java.awt.Color;

public class Shape {
    //Step 1: Declare class variables
    private String name;
    private int x;
    private int y;
    private Color color;
    
    //Step 2: Constructors
    public Shape()
    {

    }

    public Shape(String name, int x, int y, Color color)
    {
        super();
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //Step 3: Getters  & Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.x = y;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    //Step 4: Additional
    public String getInfo(){
        return name;
    }
    
}
