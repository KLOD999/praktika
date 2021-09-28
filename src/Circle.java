import java.lang.*;
public class Circle {
    protected double radius;
    public Circle(double r)
    {
        r = radius;
    }
    public Circle()
    {
        radius = 5;
    }
    public Circle(double radius, boolean filled, String color)
    {
        color = "green";
        filled = false;
        radius = 5;
    }
    public double getRadius()
    {
        return  radius;
    }
    public  void setRadius(double radius)
    {
        this.radius = radius;
    }
    public String toString()
    {
        //return this.radius;

    }
}
