package image;

import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image{

    List<Color> palette;
    int[][] indexesOfColors;
    int weidht;
    int height;

    @Override
    public int getHeight(){
        return this.height;
    }

    @Override
    public int getWidth(){
        return this.weidht;
    }

    public void setPixelsColor(Color[][] pixels){

    }

    public void setPixelColor(Color color, int x, int y){

    }

    public void createRepresentation(){

    }

    public PaletteRasterImage(Color[][] pixels){

    }

    public PaletteRasterImage(Color color, int width, int height){

    }
    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }


}
