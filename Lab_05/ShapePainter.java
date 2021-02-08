package Lab_05;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ShapePainter extends JFrame {
    public ShapePainter() {
        setTitle("Lab 05");
        setSize(600, 300);
        setVisible(true);
    }
    
    //Overloading - Draw
    public void draw(Graphics g, Circle circle) 
    {
        g.setColor(circle.getColor());
        g.fillOval(circle.getX(), 
        circle.getY(), 
        circle.getDiameter(), 
        circle.getDiameter());
        g.drawString(circle.getInfo(), circle.getX(), circle.getY());
    }
    
    //Overloading  - Draw
    public void draw(Graphics g, Rectangle rectangle) 
    {
        g.setColor(rectangle.getColor());
        g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        //g.drawString(rectangle.getInfo(), rectangle.getX(),rectangle.getY());
    }

    //
    public void showInfo(Graphics g, Shape s){
        g.drawString(s.getInfo(), s.getX(), s.getY()); //Dynamic Binding
    }
    
    public void paint(Graphics g) 
    {
        super.paint(g);
        //draw(g, new Circle(100, 100, 50, Color.red));
        //draw(g, new Rectangle(250, 100, 200, 100, Color.blue));

        Circle circle = new Circle(100,100,50, Color.red);
        draw(g, circle);
        //Shape s1 = (Shape) circle; // s1 & circle refer to the same object
        //showInfo(g, s1);
        showInfo(g, circle); // trigger Circle.getInfo()

        Rectangle rectangle = new Rectangle(250, 100, 200, 100, Color.blue);
        draw(g, rectangle);
        //Shape s2 = (Shape) rectangle;
        //showInfo(g, s2);
        showInfo(g, rectangle); // trigger Rectangle.getInfo();

    }
    public static void main(String[] args) 
    {
        ShapePainter painter= new ShapePainter();
    }
}