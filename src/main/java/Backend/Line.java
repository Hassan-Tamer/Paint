package Backend;

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
        canvas.drawLine(Start.x, Start.y,
                        getFinalPosition().x, getFinalPosition().y);
    }

    public boolean contains(Point point) {
        Point Start = getPosition();
        double  m = (getFinalPosition().y - Start.y)/(getFinalPosition().x - Start.x);
        
       if((point.y-Start.y)/(point.x-Start.x)==m){
           return true;
       }
       return false;
    }

    @Override
    public void moveTo(Point point) {
        Point Start = getPosition();
        Point dPoint =getDraggingPoint();
        point.x+=(dPoint.x-Start.x);
        point.y+=(dPoint.y-Start.y);
        int x = point.x - Start.x;
        int y = point.y - Start.y;
        FinalPosition.x+=x;
        FinalPosition.y+=y;
        setPosition(point);
    }
}
