package image;

import javafx.scene.paint.Color;

import java.util.Arrays;

public class BruteRasterImage implements Image {

    public Color[][] pixels;

    @Override
    public int getWidth() {
        return pixels.length;
    }

    @Override
    public int getHeight() {
        return pixels[0].length;
    }

    public BruteRasterImage(Color color, int width, int height){
        this.pixels=new Color[width][height];

        for(int largeur=0;largeur<width;largeur++){

            for(int longeur=0;longeur<height;longeur++){

                this.pixels[longeur][largeur]=color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        this.pixels=colors;
    }

    public void createRepresentation(){

    }

    public void setPixelColor(Color color, int x, int y){

    }

    public Color getPixelColor(int x, int y){

    }

    private void setPixelsColor(Color[][] pixels){

    }

    private void setPixelsColor(Color color){

    }

    protected void setWidth(int width){
        pixels=Arrays.copyOf(pixels,width);
    }

    protected void setHeight(int height){
        for(int width=0;width<getHeight();width++) {
            pixels[width] = Arrays.copyOf(pixels[width], height);
        }

    }
}
