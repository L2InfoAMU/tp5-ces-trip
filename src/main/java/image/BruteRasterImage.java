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
        this.pixels=colors;
    }

    public void createRepresentation(){
        this.pixels=new Color[this.width][this.height];
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
        for (int i=0; i<getHeight(); i++) {
            for (int j=0; j<getWidth(); j++) {
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