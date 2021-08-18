<<<<<<< Updated upstream
import java.awt.*;

class Cell{
    // fields
    int x;
    int y;
    static int size = 35;

    //constructors
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    boolean contains(Point p){
        if (p != null){
            return (x < p.x && x+size > p.x && y < p.y && y+size > p.y);
        } else {
            return false;
        }
    }
}
=======
import java.awt.Graphics;
    
public class Cell {
    int x;
    int y;
    static int size =35;
    
    public Cell (int posx, int posy){
        this.x = posx;
        this.y = posy;
    }

    public void drawCell(Graphics g){
        g.drawRect(x, y, size, size);
    }

}
>>>>>>> Stashed changes
