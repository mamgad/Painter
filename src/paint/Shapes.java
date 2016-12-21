/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Josie
 */
public abstract class Shapes {

    protected Point startPoint;
    protected Color shapeColor;
    protected boolean isfilled;
    protected boolean isSelected;

    public Shapes(Point startPoint, Color shapeColor, boolean isfilled) {
        this.startPoint = startPoint;
        this.shapeColor = shapeColor;
        this.isfilled = isfilled;
    }
    public Point getStartPoint() {
        return startPoint;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setisSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public boolean isIsfilled() {
        return isfilled;

    }
//    public abstract boolean contains(Point p);

    public void setIsfilled(boolean isfilled) {
        this.isfilled = isfilled;
    }

    public abstract boolean contains(Point p);

}
