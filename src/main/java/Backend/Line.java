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
        canvas.drawLine(((int)Start.getX()), ((int)Start.getY()),
                        ((int)getFinalPosition().getX()), ((int)getFinalPosition().getY()));
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
        int x = point.x - FinalPosition.x;
        int y = point.y - FinalPosition.y;
        setPosition(new Point(Start.x+x,Start.y+y));
        FinalPosition.x+=x;
        FinalPosition.y+=y;
    }
}
