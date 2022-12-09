package Shapes;

import java.awt.Graphics;
import java.awt.Point;

public class Line extends ShapeAttributes{
    private Point FinalPosition;
    
    public Line(Point FinalPosition, Point StartingPosition) {
        super(StartingPosition);
        this.FinalPosition = FinalPosition;
    }

    public Point getFinalPosition() {
        return FinalPosition;
    }

    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        Point Start = getPosition();
        canvas.drawLine(((int)Start.getX()), ((int)Start.getY()),
                        ((int)getFinalPosition().getX()), ((int)getFinalPosition().getY()));
    }

    public boolean contains(Point point) {
        Point Start=new Point(getPosition().x, getPosition().y);
        double Length=Start.distance(FinalPosition);
        double ToPoint =Start.distance(point) + FinalPosition.distance(point);
        return Math.abs(ToPoint-Length) < 3;
    }
    
    @Override
    public void moveTo(Point point) {
        Point Start = getPosition();
        Point Drag = getDraggingPoint();
        point.x+=(getPosition().x-Drag.x);
        point.y+= (getPosition().y-Drag.y);
        setPosition(new Point(point));
        int x = point.x - Start.x;
        int y = point.y - Start.y;
        FinalPosition.x+=x;
        FinalPosition.y+=y;   
    }

    @Override
    public String toString() {
        return "Line";
    }
}
