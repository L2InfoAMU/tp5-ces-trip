package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VectorImage extends RasterImage implements Image {

    public List<Shape> shapes;

    public VectorImage(List<Shape> shapes, int width, int height) {
        this.shapes=new ArrayList<>();
        for (Shape s : shapes) {
            this.shapes.add(s);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        for (Shape s : shapes) {
            if (s.contains(new Point(x,y)))
                return s.getColor();
        }
        return Color.WHITE;
    }
}
