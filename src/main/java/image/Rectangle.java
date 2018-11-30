package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    public int x,y,width,height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public boolean contains(Point point){
    return point.x<width-this.x && point.y<height-this.y;
    }

    public Color getColor(){
        return this.color;
    }
}
