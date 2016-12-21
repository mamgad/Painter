/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Josie
 */
class Line extends Shapes {

    private Point endPoint;

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Line(Point startPoint, Point endPoint, Color shapeColor, boolean isfilled) {
        super(startPoint, shapeColor, isfilled);
        this.endPoint = endPoint;
    }

    @Override
    public boolean contains(Point p) {
        Point2D p1 = new Point2D.Float((int) p.getX(), (int) p.getY());
        Line2D l2d;
        l2d = new Line2D.Float((int) startPoint.getX(), (int) startPoint.getY(), (int) endPoint.getX(), (int) endPoint.getY());

        if (l2d.contains(p1)) {
            return true;
        } else {
            return false;
        }
    }

}
