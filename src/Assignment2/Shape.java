package Assignment2;

import java.util.*;

public class Shape
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.input();
        r.area();
    }
}

interface group
{
    void input();
    void area();
}

class Circle implements group
{
    short radius;
    double pie = 3.14, area;
    public void input()
    {
        radius=4;
    }
    public void area()
    {
        area = pie * radius * radius;
        System.out.println("AREA OF CIRCLE : "+area);
    }
}
class Rectangle extends Circle
{
    short length,breadth;
    double area;
    public void input()
    {
        super.input();
        length=8;
        breadth=4;
    }
    public void area()
    {
        super.area();
        area = length * breadth;
        System.out.println("Area of Rectangle: "+area);
    }
}
