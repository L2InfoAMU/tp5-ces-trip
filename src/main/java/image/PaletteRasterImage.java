package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image{

    List<Color> palette;
    int[][] indexesOfColors;
    int width;
    int height;

    @Override
    public int getHeight(){
        return this.height;
    }

    @Override
    public int getWidth(){
        return this.width;
    }

    public void setPixelsColor(Color[][] pixels){
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                setPixelColor(pixels[i][j], i,j);
            }
        }
    }

    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y]=palette.indexOf(color);

    }


    private void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                indexesOfColors[i][j] = palette.indexOf(color);
            }
        }
    }

    public void createRepresentation(){
        this.palette = new ArrayList<Color>();
        this.indexesOfColors = new int[this.width][this.height];
    }

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
    public Color getPixelColor(int x, int y) {
        return palette.get(this.indexesOfColors[x][y]);
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}