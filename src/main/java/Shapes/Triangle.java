package Shapes;

import java.awt.Graphics;
import java.awt.Point;

public class Triangle extends ShapeAttributes{

    private Point point2 , point3;

    public Triangle(Point point1 , Point point2 , Point point3){
        super(point1);
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public void draw(Graphics canvas) {
        Point point1 = getPosition();
        int x[] = {((int)point1.getX()) , ((int)point2.getX()) , ((int)point3.getX())};
        int y[]= {((int)point1.getY()) , ((int)point2.getY()) , ((int)point3.getY())};
        canvas.setColor(getColor());
        canvas.drawPolygon(x, y, 3);
        canvas.setColor(getFillColor());
        canvas.fillPolygon(x, y, 3);
    }

    @Override
    public boolean contains(Point point) {
        Point point1 = getPosition();
        int x[] = {((int)point1.getX()) , ((int)point2.getX()) , ((int)point3.getX())};
        int y[]= {((int)point1.getY()) , ((int)point2.getY()) , ((int)point3.getY())};
        java.awt.Polygon polygon=new java.awt.Polygon(x, y, 3);
        return polygon.contains(point.x, point.y);
    }

    @Override
    public void moveTo(Point point) {
        int xdiff = point.x - getDraggingPoint().x;
        int ydiff = point.y - getDraggingPoint().y;
        point2 = new Point(point2.x + xdiff, point2.y + ydiff);
        point3 = new Point(point3.x + xdiff, point3.y + ydiff);
        setPosition(new Point(getPosition().x + xdiff, getPosition().y + ydiff));
    }  
    
    @Override
    public String toString() {
        return "Triangle";
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }
}
