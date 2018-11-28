package image;

import javafx.scene.paint.Color;
import java.util.Arrays;

public class BruteRasterImage implements Image {

    public Color[][] pixels;
    int height;
    int width;

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public BruteRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors){
        setHeight(colors[0].length);
        setWidth(colors.length);
        createRepresentation();
        setPixelsColor(colors);
    }

    public void createRepresentation(){
        this.pixels=new Color[this.width][this.height];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels){
        for (int i=0; i<getWidth(); i++) {
            for (int j=0; j<getHeight(); j++) {
                this.pixels[i][j] = pixels[i][j];
            }
        }
    }

    private void setPixelsColor(Color color){
        for (int i=0; i<getWidth(); i++) {
            for (int j=0; j<getHeight(); j++) {
                pixels[i][j] = color;
            }
        }
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}