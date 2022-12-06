package Backend;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingEngineBody extends JPanel implements DrawingEngine {
    private ArrayList<Shape> ShapeList = new ArrayList<>();
    private int index;


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
        refresh();
    }

    @Override
    public void removeShape(Shape shape) {
            boolean isFound = ShapeList.remove(shape);
            if(isFound)
                refresh();
    }

    @Override
    public Shape[] getShapes() {
        Shape[] s = ShapeList.toArray(new Shape[0]);
        return s;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Shape s : ShapeList){
            s.draw(g);
        }
    }

    @Override
    public void refresh(Graphics canvas) {
        this.repaint();
    }

    public void refresh() {
        this.repaint();
    }
}
