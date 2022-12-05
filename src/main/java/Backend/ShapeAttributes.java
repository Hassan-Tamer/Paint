package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public abstract class ShapeAttributes implements Shape{
    private Point position , draggingPoint;
    private Color color = Color.BLACK;
    private Color fillColor = Color.WHITE;

    public ShapeAttributes(Point position) {
        setPosition(position);
        }

    @Override
    public void setDraggingPoint(Point point) {
        draggingPoint = point;
        
    }
    
    @Override
    public Point getDraggingPoint() {
        return draggingPoint;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;    
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public abstract void draw(Graphics canvas);
}

