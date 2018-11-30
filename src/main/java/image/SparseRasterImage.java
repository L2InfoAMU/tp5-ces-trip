package image;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends RasterImage implements Image {

    HashMap<Point,Color> hash;

    public SparseRasterImage(Color color, int width, int height){

    }
    public SparseRasterImage(Color[][] pixels)

    public void createRepresentation()

    public void setPixelColor(Color color, int x, int y)

    public Color getPixelColor(int x, int y)

    private void setPixelsColor(Color[][] pixels){

    }

    private void setPixelsColor(Color color){
        for(Point point : hash.keySet()) {
            hash.put(point, color);
        }
    }
}
