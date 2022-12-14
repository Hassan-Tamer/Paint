package Shapes;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends ShapeAttributes{
    private int width,height;
    
    public Rectangle(Point position,int width, int height) {
        super(position);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getFillColor());
        canvas.fillRect(((int)getPosition().getX()), ((int)getPosition().getY()), width, height);
        canvas.setColor(getColor());
        canvas.drawRect(((int)getPosition().getX()), ((int)getPosition().getY()), width, height);
    }

    @Override
    public boolean contains(Point point) {
        Point Start = getPosition();
        java.awt.Rectangle r = new java.awt.Rectangle(Start.x,Start.y,width,height);
        return r.contains(point);
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
        return "Rectangle";
    }
}
