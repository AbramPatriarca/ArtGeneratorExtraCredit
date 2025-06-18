import javax.swing.*;
import java.awt.*;
import java.nio.file.attribute.GroupPrincipal;

public class Main extends JFrame{
    
    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;


    // public Main() {
    //     mandelbrot = new JPanel();
    //     mandelbrot.setLayout(null);
    // }

    public static void main(String[] args) throws Exception {
        Main theGUI = new Main();
        SwingUtilities.invokeLater( () -> theGUI.createFrame(theGUI) );

        synchronized(theGUI) {
            theGUI.wait();
        }

        theGUI.startAnimation();

    }

    public void createFrame(Object semaphore) {

        this.setTitle("Algorithmic Art Generator");
        this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);

        Mandelbrot mandel = new Mandelbrot();
        this.add(mandel);

    }

    public void startAnimation() {
      
    }

}