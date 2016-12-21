/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Josie
 */
public class Rectangle extends Shapes {

    private int height;
    private int width;

    public Rectangle(Point startPoint, int width, int height, Color shapeColor, boolean isfilled) {
        super(startPoint, shapeColor, isfilled);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

@Override
    public boolean contains(Point p) {

        Point2D p2 = new Point2D.Float((int)p.getX(), (int)p.getY());
        Rectangle2D r2d;
        r2d = new Rectangle2D.Float((int)this.getStartPoint().getX(), (int)this.getStartPoint().getY(), this.getHeight(), this.getWidth());

        if (r2d.contains(p2)) {
            return true;
        } else {
            return false;
        }

    }
}
