/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/**
 *
 * @author user
 */
public class SaveAndLoad {

    public void save(ArrayList<Shape> shapes) throws ParserConfigurationException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fact.newDocumentBuilder();
        Document xmlDocument = builder.newDocument();
        Element rootEle = xmlDocument.createElement("Shapes");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                Element circ = xmlDocument.createElement("Circle");
                Element Rad = xmlDocument.createElement("radius");
                Text val = xmlDocument.createTextNode(c.getRadius() + "");
                Rad.appendChild(val);
                circ.appendChild(Rad);
                rootEle.appendChild(circ);

            } else if (shape instanceof Line) {
                Line l = (Line) shape;
                Element line = xmlDocument.createElement("Line");
                Element x = xmlDocument.createElement("X_value");
                Element y = xmlDocument.createElement("Y_value");
                Text xval = xmlDocument.createTextNode(l.startPoint.getX() + "");
                Text yval = xmlDocument.createTextNode(l.startPoint.getY() + "");
                x.appendChild(xval);
                y.appendChild(yval);
                line.appendChild(x);
                line.appendChild(y);
                rootEle.appendChild(line);

            } else if (shape instanceof Rectangle) {

                Rectangle rect = (Rectangle) shape;
                Element recmain = xmlDocument.createElement("Rectangle");
                Element xstpoint = xmlDocument.createElement("XStpoint_value");
                Element ystpoint = xmlDocument.createElement("YStpoint_value");
                Element width = xmlDocument.createElement("Widthh_value");
                Element height = xmlDocument.createElement("Heightt_value");
                Text xstpointval = xmlDocument.createTextNode(rect.getStartPoint().getX() + "");
                Text ystpointval = xmlDocument.createTextNode(rect.getStartPoint().getY() + "");
                Text widthval = xmlDocument.createTextNode(rect.getWidth() + "");
                Text heightval = xmlDocument.createTextNode(rect.getHeight() + "");
                xstpoint.appendChild(xstpointval);
                ystpoint.appendChild(ystpointval);
                width.appendChild(widthval);
                height.appendChild(heightval);
                recmain.appendChild(xstpoint);
                recmain.appendChild(ystpoint);
                recmain.appendChild(width);
                recmain.appendChild(height);
                rootEle.appendChild(recmain);

            } //           else if (shape instanceof Ellipse)
            //           {
            //                Ellipse elli=(Ellipse) shape;
            //                Element elli=xmlDocument.createElement("Ellipse");
            //                Element xstpoint=xmlDocument.createElement("XStpoint_value");
            //                Element ystpoint=xmlDocument.createElement("YStpoint_value");
            //                Element width=xmlDocument.createElement("Widthh_value");
            //                Element height=xmlDocument.createElement("Heightt_value");
            //                Text xstpointval = xmlDocument.createTextNode(elli.getstartingPoint().getXStpoint() + "");
            //                Text ystpointval = xmlDocument.createTextNode(elli.getstartingPoint().getYStpoint() + "");
            //                Text widthval = xmlDocument.createTextNode(elli.getWidth().getWidthh() + "");
            //                Text heightval = xmlDocument.createTextNode(elli.getHeight().getHeightt() + "");
            //                xstpoint.appendChild(xstpointval);
            //                ystpoint.appendChild(ystpointval);
            //                width.appendChild(widthval);
            //                height.appendChild(heightval);
            //                elli.appendChild(xstpoint);
            //                elli.appendChild(ystpoint);
            //                elli.appendChild(width);
            //                elli.appendChild(height);
            //                rootEle.appendChild(elli);
            //               
            //           }
            //           else if (shape instanceof Square)
            //           {
            //                Square sqr=(Square) shape;
            //                Element sqr=xmlDocument.createElement("Square");
            //                Element xstpoint=xmlDocument.createElement("XStpoint_value");
            //                Element ystpoint=xmlDocument.createElement("YStpoint_value");
            //                Element lenght=xmlDocument.createElement("lenghht_value");
            //                Text xstpointval = xmlDocument.createTextNode(sqr.getstartingPoint().getXStpoint() + "");
            //                Text ystpointval = xmlDocument.createTextNode(sqr.getstartingPoint().getYStpoint() + "");
            //                Text lenghtval = xmlDocument.createTextNode(sqr.getlenght().getlenghht() + "");
            //                xstpoint.appendChild(xstpointval);
            //                ystpoint.appendChild(ystpointval);
            //                lenght.appendChild(lenghtval);
            //                sqr.appendChild(xstpoint);
            //                sqr.appendChild(ystpoint);
            //                sqr.appendChild(lenght);
            //                rootEle.appendChild(sqr);
            //                
            //           }
            else {
                Triangle tri = (Triangle) shape;
                Element trimain = xmlDocument.createElement("Triangle");
                Element xstpoint = xmlDocument.createElement("XStpoint_value");
                Element ystpoint = xmlDocument.createElement("YStpoint_value");
                Element x2ndpoint = xmlDocument.createElement("XSecondpoint_value");
                Element y2ndpoint = xmlDocument.createElement("YSecondpoint_value");
                Element x3rdpoint = xmlDocument.createElement("XThirdpoint_value");
                Element y3rdpoint = xmlDocument.createElement("YThirdpoint_value");
                Text xstpointval = xmlDocument.createTextNode(tri.getStartPoint().getX() + "");
                Text ystpointval = xmlDocument.createTextNode(tri.getStartPoint().getY() + "");
                Text x2ndpointval = xmlDocument.createTextNode(tri.getSecPnt().getX() + "");
                Text y2ndpointval = xmlDocument.createTextNode(tri.getSecPnt().getY() + "");
                Text x3rdpointval = xmlDocument.createTextNode(tri.getThPnt().getX() + "");
                Text y3rdpointval = xmlDocument.createTextNode(tri.getThPnt().getY() + "");
                xstpoint.appendChild(xstpointval);
                ystpoint.appendChild(ystpointval);
                x2ndpoint.appendChild(x2ndpointval);
                y2ndpoint.appendChild(y2ndpointval);
                x3rdpoint.appendChild(x3rdpointval);
                y3rdpoint.appendChild(y3rdpointval);
                trimain.appendChild(xstpoint);
                trimain.appendChild(ystpoint);
                trimain.appendChild(x2ndpoint);
                trimain.appendChild(y2ndpoint);
                trimain.appendChild(x3rdpoint);
                trimain.appendChild(y3rdpoint);
                rootEle.appendChild(trimain);

            }
            ///////////////////////LOAD FUNCTION?///////
        }
    }

    public ArrayList<Shapes> Load() throws ParserConfigurationException, FileNotFoundException, IOException, SAXException, org.xml.sax.SAXException {
        //  {
//        ArrayList<Shape> LoadedShapes = new ArrayList<>();
//        File xmlFile = new File("test.txt");
//        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = fact.newDocumentBuilder();
//        Document xmlDocument = builder.parse(xmlFile);
//        NodeList list = xmlDocument.getElementsByTagName("Shapes");
        
//         
//        for(Element e: xmlDocument.)
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
            DocumentBuilder builder =factory.newDocumentBuilder();
            Document doc = builder.parse("test.xml");    /////ASM EL XML FILE EL ANA HATA GOWA EL FOLDER BEL DRAG////
            NodeList shapelist =doc.getElementsByTagName("shapes");
            for(int i=0;i<shapelist.getLength();i++)
            {
                Node s = shapelist.item(i);
                if(s.getNodeType()== Node.ELEMENT_NODE)
                {
                    Element shape = (Element) s;
                   String type= shape.getAttribute("type");          /////shape name///
                  NodeList namelist= shape.getChildNodes();
                  for(int j=0;j<namelist.getLength();j++)
                  {
                      Node n= namelist.item(j);
                      if(n.getNodeType()==Node.ELEMENT_NODE)
                      {
                          Element name = (Element) n;
                          
                      }
                  }
                      
                }
                
                
            }
        
        return null;
        
        
        
        
        
        
        
        
        
    }

}
