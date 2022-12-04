package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
public class Circle extends ShapeAttributes {
    private int Radius;
    
    public Circle(Point position,int Radius){
        super(position);
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
        canvas.fillOval(((int)getPosition().getX()), ((int)getPosition().getX()) , 2*Radius , 2*Radius);
        canvas.setColor(getColor());
        canvas.drawOval(((int)getPosition().getX()), ((int)getPosition().getX()) , 2*Radius , 2*Radius);
    }
}
