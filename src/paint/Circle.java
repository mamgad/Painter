/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Josie
 */
public class Circle extends Shapes {
private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Circle(Point startPoint,int radius, Color shapeColor, boolean isfilled) {
        super(startPoint, shapeColor, isfilled);
        this.radius=radius;
    }

@Override
    public boolean contains(Point p) {
        Ellipse2D r;
        r = new Ellipse2D.Float((int)startPoint.getX(), (int)startPoint.getY(), 2 * radius, 2 * radius);

        if (r.contains(p.getX(), p.getY())) {
            return true;
        } else {
            return false;
        }}   
    
}
