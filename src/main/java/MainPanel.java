import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private Canvas canvas;
    private SliderPanel sliders;
    MainPanel(){
        sliders = new SliderPanel();

        canvas = new Canvas(){
            Color col = sliders.get_val();
            @Override
            public void paint(Graphics g){
                super.paint(g);
                g.setColor(col);
                g.fillOval(300,100,100,100);
            }
        };

        canvas.setSize(800,300);
        canvas.setBackground(Color.blue);
        canvas.setVisible(true);

        //this.add(new ButtonPanel());
        this.add(sliders);
        this.add(canvas);
        setLayout(new GridLayout(2,1));
    }
}


