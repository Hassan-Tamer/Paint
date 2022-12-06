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
        Point point = getPosition();

        canvas.setColor(getFillColor());
        canvas.fillOval(point.x, point.y , 2*Radius , 2*Radius);
        canvas.setColor(getColor());
        canvas.drawOval(point.x, point.y, 2*Radius , 2*Radius);
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
        Point p=getDraggingPoint();
        Point start = getPosition();
        point.x+=(start.x-p.x);
        point.y+=(start.y-p.y);
        setPosition(point);
    }
}
