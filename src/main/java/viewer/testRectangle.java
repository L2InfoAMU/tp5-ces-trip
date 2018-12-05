package viewer;

import image.Point;
import image.Rectangle;
import javafx.scene.paint.Color;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class testRectangle {
    public Point P1 =new Point(1,1);
    public Point P2= new Point(10,10);
    public Point P3= new Point(8, 2);
    public Rectangle R1= new Rectangle(0,0,9,5,Color.CYAN);
    public Rectangle R2= new Rectangle(4,1,5,5,Color.DARKBLUE);
    @Test
    public void testRectangleContains(){
        assertTrue(R1.contains(P1));
        assertTrue(R1.contains(P3));
        assertFalse(R1.contains(P2));
        assertFalse(R2.contains(P1));
        assertTrue(R2.contains(P3));
        assertFalse(R2.contains(P2));
    }
}
