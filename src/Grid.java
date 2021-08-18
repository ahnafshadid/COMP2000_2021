<<<<<<< Updated upstream
import java.awt.*;

class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];

    // constructor
    public Grid(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,10+35*j);
            }
        }
    }

    // methods
    public void paint(Graphics g, Point mousePos){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paint(g, mousePos);
            }
        }
    }
}
=======
import java.awt.Graphics;

public class Grid {
    Cell[][] cells;

    public Grid(){
        createGrid();
    } 
  

    public void createGrid(){
        cells = new Cell[20][20];
        for (int i =0; i < cells.length; i++){
            for(int j =0; j < cells[i].length; j++){
                cells[i][j] = new Cell (10 + i * 35,10 + j * 35); 

                
            }
        }
    } 
        //for (int i= 10; i<cells.length; i++){
          //  for(int j=10; j<710; j+=35){
            //    g.setColor(Color.WHITE);
              //  g.fillRect(i, j, 35, 35);
                //g.setColor(Color.BLACK);
               // g.drawRect(i, j, 35, 35);
           // }
          
    public void drawGrid(Graphics g){
        for (Cell[] col: cells){
            for (Cell c: col){
                c.drawCell(g);

            }
        }
    }
}
>>>>>>> Stashed changes
