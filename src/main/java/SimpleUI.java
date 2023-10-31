import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleUI {
    static GraphicsConfiguration gc;	// Contains this computer’s graphics configuration
    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        frame.setSize(800,800);
        frame.getContentPane().add(new MainPanel());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });



    }

}
