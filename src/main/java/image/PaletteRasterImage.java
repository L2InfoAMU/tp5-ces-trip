package image;

import javafx.scene.paint.Color;

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
                indexesOfColors[i][j]=palette.indexOf(pixels[i][j]);
            }
        }

    }

    public void setPixelColor(Color color, int x, int y){
        if(palette.contains(color))
            indexesOfColors[x][y]=palette.indexOf(color);
        else
            palette.add(color);
    }


    private void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                indexesOfColors[i][j] = palette.indexOf(color);
            }
        }
    }


    public void createRepresentation(){

    }

    public PaletteRasterImage(Color[][] pixels){

    }

    public PaletteRasterImage(Color color, int width, int height){

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(this.indexesOfColors[x][y]);
    }


}
