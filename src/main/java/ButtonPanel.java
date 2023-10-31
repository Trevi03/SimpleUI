import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonPanel extends JPanel {
    private JButton button1;
    private JButton button2;

    ButtonPanel() {
        this.button1 = new JButton("button 1");
        this.button2 = new JButton("button 2");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 pressed");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 pressed");
            }
        });

        this.add(button1);
        this.add(button2);
        setLayout(new GridLayout(1,2));



    }

}


