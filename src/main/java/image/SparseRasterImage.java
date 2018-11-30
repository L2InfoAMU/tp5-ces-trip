package image;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends RasterImage implements Image {

    HashMap<Point,Color> hash;

    public SparseRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);
        createRepresentation();
        setPixelsColor(color);
    }
    public SparseRasterImage(Color[][] pixels) {
        setHeight(pixels[0].length);
        setWidth(pixels.length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation() {
        hash = new HashMap<Point,Color>();
    }

    public void setPixelColor(Color color, int x, int y) {
        hash.put(new Point(x,y), color);
    }

    public Color getPixelColor(int x, int y) {
        return hash.get(new Point(x,y));
    }

    private void setPixelsColor(Color[][] pixels) {
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                setPixelColor(pixels[i][j], i,j);
            }
        }
    }

    private void setPixelsColor(Color color){
        for(Point point : hash.keySet()) {
            hash.put(point, color);
        }
    }
}
