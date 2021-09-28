import java.lang.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(String c, boolean b)
    {
        c = color;
        b = false;
    }
    public Shape ()
    {
        color = "yellow";
        filled = false;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor(String color)
    {
        return color;
    }
    public boolean isFilled(boolean filled)
    {
        return  filled;
    }
    public  void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public double getArea()
    {
        return this.filled;
    }
    public double getPerimerer()
    {
        return this.color;
    }
    public String toString()
    {
        return this.color + this.filled;
    }
}
