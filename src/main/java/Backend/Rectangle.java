package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends ShapeAttributes{
    private int width,height;
    
    public Rectangle(Point position, Color color, Color fillColor, int width, int height) {
        super(position, color, fillColor);
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
}
