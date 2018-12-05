package viewer;

import image.Point;
import image.Rectangle;
import image.Shape;
import image.VectorImage;
import javafx.scene.paint.Color;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;


public class testVectorImage {
    public Point P1 =new Point(1,1);
    public Point P2= new Point(10,10);
    public Point P3= new Point(8, 2);
    public Rectangle R1= new Rectangle(0,0,2,2,Color.CYAN);
    public Rectangle R2= new Rectangle(4,2,5,5,Color.DARKBLUE);
    public Rectangle R3= new Rectangle(9,10,10,10,Color.GOLD);

    List<Shape> list = new ArrayList<>();

    @Test
    public void testVectorImagegetPixelColor(){
        list.add(R1);
        list.add(R2);
        list.add(R3);
        VectorImage vectorimage= new VectorImage(list,800,500);
        assertEquals(vectorimage.getPixelColor(1,1),Color.CYAN);
        assertEquals(vectorimage.getPixelColor(8,5),Color.DARKBLUE);
        assertEquals(vectorimage.getPixelColor(11,15),Color.GOLD);
        assertEquals(vectorimage.getPixelColor(100,250),Color.WHITE);
        assertEquals(vectorimage.getPixelColor(9,8),Color.WHITE);
    }
}
