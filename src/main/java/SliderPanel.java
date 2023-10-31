import javax.swing.*;
import java.awt.*;

public class SliderPanel extends JPanel {
    private JSlider rslide;
    private JSlider gslide;
    private JSlider bslide;
    SliderPanel(){
        this.rslide = new JSlider(0,255,255);
        rslide.setBorder(BorderFactory.createTitledBorder("R value for RGB"));
        rslide.setPaintTicks(true);
        rslide.setPaintTrack(true);
        rslide.setPaintLabels(true);
        rslide.setMajorTickSpacing(51);

        this.gslide = new JSlider(0,255,255);
        gslide.setBorder(BorderFactory.createTitledBorder("G value for RGB"));
        gslide.setPaintTicks(true);
        gslide.setPaintTrack(true);
        gslide.setPaintLabels(true);
        gslide.setMajorTickSpacing(51);

        this.bslide = new JSlider(0,255,255);
        bslide.setBorder(BorderFactory.createTitledBorder("B value for RGB"));
        bslide.setPaintTicks(true);
        bslide.setPaintTrack(true);
        bslide.setPaintLabels(true);
        bslide.setMajorTickSpacing(51);

        this.add(rslide);
        this.add(gslide);
        this.add(bslide);
        setLayout(new GridLayout(3,1));
    }

    public Color get_val(){
        int R = rslide.getValue();
        int G = gslide.getValue();
        int B = bslide.getValue();
        return new Color(R,G,B);
    }
}
