import Panels.Sliders.SliderPanel;
import Shapes.Drawing;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private Canvas drawing;
    private SliderPanel sliders;
    MainPanel() {
        sliders = new SliderPanel();
        drawing = new Drawing();

        this.add(sliders);
        this.add(drawing);

        setLayout(new GridLayout(2,1));

    }
}


