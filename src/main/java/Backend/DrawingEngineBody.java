package Backend;

import java.awt.Graphics;
import java.util.ArrayList;

public class DrawingEngineBody implements DrawingEngine {
    private ArrayList<Shape> ShapeList = new ArrayList<>();
    private Graphics canvas;
    private int index;

    public DrawingEngineBody(Graphics canvas){
        this.canvas = canvas;
    }

    public int getIndex(){
        return index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    @Override
    public void addShape(Shape shape) {
        ShapeList.add(shape);
        index++;
        refresh(canvas);
    }

    @Override
    public void removeShape(Shape shape) {
            boolean isFound = ShapeList.remove(shape);
            if(isFound)
                refresh(canvas);
    }

    @Override
    public Shape[] getShapes() {
        Shape[] s = ShapeList.toArray(new Shape[0]);
        return s;
    }

    @Override
    public void refresh(Graphics canvas) {
        canvas.clearRect(0, 0, 999, 999);
        for(Shape s : ShapeList){
            s.draw(canvas);
        }
    }
}
