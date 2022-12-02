package Backend;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Line extends ShapeAttributes{
    private Point FinalPosition , StartingPosition;
    
    public Line(Point FinalPosition, Point StartingPosition , Color color) {
        super(null,color,null);
        this.FinalPosition = FinalPosition;
        this.StartingPosition = StartingPosition;
    }

    public Point getFinalPosition() {
        return FinalPosition;
    }

    public Point getStartingPosition() {
        return StartingPosition;
    }


    public void setStartingPosition(Point startingPosition) {
        StartingPosition = startingPosition;
    }

    public void draw(Graphics canvas) {
        canvas.setColor(getColor());
        canvas.drawLine(((int)getStartingPosition().getX()), ((int)getStartingPosition().getY()),
                        ((int)getFinalPosition().getX()), ((int)getFinalPosition().getY()));
    }
}
