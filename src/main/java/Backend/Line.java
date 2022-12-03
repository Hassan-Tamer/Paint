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
}
