package Shapes;

import java.awt.Graphics;
import java.awt.Point;
public class Circle extends ShapeAttributes {
    private int Width , Height;
    
    public Circle(Point position,int Width , int Height){
        super(position);
        this.Width = Width;
        this.Height = Height;
    }

    @Override
    public void draw(Graphics canvas) {
        Point point = getPosition();

        canvas.setColor(getFillColor());
        canvas.fillOval(point.x, point.y , Width , Height);
        canvas.setColor(getColor());
        canvas.drawOval(point.x, point.y,Width , Height);
    }

    private double ovalCalculations(double h , double k , double x , double y , double a , double b ){
        double p = ((double)Math.pow((x - h), 2)
                    / (double)Math.pow(a, 2))
                   + ((double)Math.pow((y - k), 2)
                      / (double)Math.pow(b, 2));
 
        return p;
    }

    @Override
    public boolean contains(Point point) {
        double width = this.Width;
        double height = this.Height;
        double rx = width/2;
        double ry = height/2;
        Point Start = getPosition();
        Point Center = new Point();
        Center.x = Start.x +((int)rx);
        double h = Center.x;
        Center.y = Start.y + ((int)ry);
        double k = Center.y;
        return ovalCalculations(h, k, point.x, point.y, rx, ry) <= 2;
        
    }

    @Override
    public void moveTo(Point point) {
        Point Drag=getDraggingPoint();
        Point start = getPosition();
        point.x+=(start.x-Drag.x);
        point.y+=(start.y-Drag.y);
        setPosition(point);
    }

    @Override
    public String toString() {
        return "Circle";
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}
