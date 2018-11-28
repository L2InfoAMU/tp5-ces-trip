package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteRasterImage implements Image {

    public Color[][] pixels;

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    public BruteRasterImage(Color color, int width, int height){

    }

    public BruteRasterImage(Color[][] colors){}

    public void createRepresentation(){


    }

    public void setPixelColor(Color color, int x, int y){
        pixels[y][x] = color;
    }

    public Color getPixelColor(int x, int y){
        return pixels[y][x];
    }

    private void setPixelsColor(Color[][] pixels){
        Arrays.fill(this.pixels, pixels);
    }

    private void setPixelsColor(Color color){
        Arrays.fill(pixels, color);
    }

    protected void setWidth(int width){

    }

    protected void setHeight(int height){

    }
}
