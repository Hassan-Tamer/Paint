package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Circle extends ShapeAttributes {
    private int Radius;
    
    public Circle(Point position, Color color, Color fillColor, int Radius){
        super(position, color, fillColor);
        this.Radius = Radius;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(getFillColor());
        canvas.fillOval(((int)getPosition().getX()), ((int)getPosition().getX()) , Radius , Radius);
        canvas.setColor(getColor());
        canvas.drawOval(((int)getPosition().getX()), ((int)getPosition().getX()) , Radius , Radius);
    }
}
