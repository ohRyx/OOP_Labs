package Lab_03;

public class Circle {

    public static final double PI= 3.14159;
    public double radius;

    public Circle(double r){
        radius= r;}
    
    public double getRadius() {
            return radius;}

    public void setRadius(double newRadius) {
            radius= newRadius;}

    public double getArea() {
            return radius* radius* PI;}
}
    
