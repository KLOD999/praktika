import java.lang.*;
public class Ball {
    private double x;
    private double y;

public Ball (double line1, double line2) {
    x = line1;
    y = line2;
}
public Ball (double line1)
{   x = line1;
    y = 0;
}
public Ball ()
{
    x = 0;
    y = 0;
}
public void SetX (double x)
{
    this.x = x;
}
public void SetY (double y)
{
    this.y = y;
}
public double getX()
{
    return x;
}
public double getY()
{
    return y;
}
public void SetXY (double x, double y)
{
    this.x = x;
    this.y = y;
}
public  void move ()
{
    System.out.print(x+1);
    System.out.print(" ");
    System.out.print(y+1);

}
}
