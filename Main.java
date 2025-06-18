import javax.swing.*;

public class Main extends JFrame{
    
    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;

    public static void main(String[] args) {
        Main theGUI = new Main();
        SwingUtilities.invokeLater( () -> theGUI.createFrame(theGUI) );

        synchronized(theGUI) {
            theGUI.wait();
        }

    }

    public void createFrame(Object semaphore) {

        this.setTitle("Algorithmic Art Generator");
        this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);

    }

}