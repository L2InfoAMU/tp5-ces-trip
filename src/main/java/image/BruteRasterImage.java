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
        createRepresentation();
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
        Arrays.fill(pixels, color);
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}