import javax.swing.*;
import java.awt.*;
<<<<<<< Updated upstream

class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
=======
 
public class Main extends JFrame implements Runnable{    
    public static void main(String[] args) throws Exception {
       Main window = new Main();
    }
    public class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }

        Grid grid = new Grid();

        @Override
        public void paint (Graphics g){
            grid.drawGrid(g);
        }
    }


    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack(); 
        this.setVisible(true);
   }
>>>>>>> Stashed changes
}