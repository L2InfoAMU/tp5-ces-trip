package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage extends RasterImage implements Image {

    public List<Shape> shapes;
    public int height, width;

    public VectorImage(List<Shape> shapes, int height, int width) {
        this.shapes = new ArrayList<>();
        this.height = height;
        this.width = width;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        if (!shapes.contains(new Point(x,y))) {
            return Color.WHITE;
        }
        return shapes.get(shapes.indexOf(new Point(x,y))).getColor();
    }
}
