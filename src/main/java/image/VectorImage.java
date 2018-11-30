package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image {

    public List<Shape> shapes;

    VectorImage(List<Shape> shapes, int width, int height) {

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
