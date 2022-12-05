package Backend;

import java.awt.Graphics;
import java.awt.Point;

import org.apache.lucene.geo.Polygon;

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
        // TODO Auto-generated method stub
        
    }

    
    
}
