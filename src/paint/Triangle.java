/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

/**
 *
 * @author Josie
 */
public class Triangle extends Shapes {

    private Point secPnt;
    private Point thPnt;

    public Triangle(Point startPoint, Point secPnt, Point thPnt, Color shapeColor, boolean isfilled) {
        super(startPoint, shapeColor, isfilled);
        this.secPnt = secPnt;
        this.thPnt = thPnt;
    }

    public Point getSecPnt() {
        return secPnt;
    }

    public void setSecPnt(Point secPnt) {
        this.secPnt = secPnt;
    }

    public Point getThPnt() {
        return thPnt;
    }

    public void setThPnt(Point thPnt) {
        this.thPnt = thPnt;
    }

    @Override
    public boolean contains(Point p) {
        Point2D p2;
      
//        GeneralPath polygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD, startPoint.);
//        polygon.moveTo(x1Points[0], y1Points[0]);
//
//        for (int index = 1; index < x1Points.length; index++) {
//            polygon.lineTo(x1Points[index], y1Points[index]);
//        };
//
//        polygon.closePath();
//        g2.draw(polygon);

        Polygon pol = new Polygon();
                pol.addPoint((int) this.getStartPoint().getX(), (int) this.getStartPoint().getY());
                pol.addPoint((int) this.getSecPnt().getX(), (int) this.getSecPnt().getY());
                pol.addPoint((int) this.getThPnt().getX(), (int) this.getThPnt().getY());
                if(pol.contains(p)){
                return true;}
                else
                return false;
                
               
    }
}
