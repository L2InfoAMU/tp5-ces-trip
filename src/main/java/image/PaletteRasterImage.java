package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image{

    List<Color> palette;
    int[][] indexesOfColors;
    int width;
    int height;

    public PaletteRasterImage(Color[][] pixels){
        setHeight(pixels[0].length);
        setWidth(pixels.length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public PaletteRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);
        createRepresentation();
        setPixelsColor(color);
    }

    @Override
    public int getHeight(){
        return this.height;
    }

    @Override
    public int getWidth(){
        return this.width;
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }

    public void createRepresentation(){
        this.palette = new ArrayList<Color>();
        this.indexesOfColors = new int[this.width][this.height];
    }

    public void setPixelsColor(Color[][] pixels){

    }

    public void setPixelColor(Color color, int x, int y){

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }


}
