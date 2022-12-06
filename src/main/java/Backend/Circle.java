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
        canvas.fillOval(getPosition().x, getPosition().y , 2*Radius , 2*Radius);
        canvas.setColor(getColor());
        canvas.drawOval(getPosition().x,getPosition().y, 2*Radius , 2*Radius);
    }

    @Override
    public boolean contains(Point point) {
        Point Start = getPosition();
        Point Center = new Point();
        Center.x = Start.x + Radius;
        Center.y = Start.y + Radius;
        return point.distance(Center) <= Radius;
    }

    @Override
    public void moveTo(Point point) {
        Point dragPoint=this.getDraggingPoint();
        point.x+=(getPosition().x-dragPoint.x);
        point.y+= (getPosition().y-dragPoint.y);
        setPosition(point);
    }
}
