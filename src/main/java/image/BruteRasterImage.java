package image;

import javafx.scene.paint.Color;

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

    }

    public Color getPixelColor(int x, int y){

    }

    private void setPixelsColor(Color[][] pixels){

    }

    private void setPixelsColor(Color color){

    }

    protected void setWidth(int width){

    }

    protected void setHeight(int height){

    }
}
