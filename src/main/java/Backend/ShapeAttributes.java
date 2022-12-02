package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public abstract class ShapeAttributes implements Shape{
    private Point position;
    private Color color;
    private Color fillColor;

    public ShapeAttributes(Point position, Color color, Color fillColor) {
        this.position = position;
        this.color = color;
        this.fillColor = fillColor;
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

