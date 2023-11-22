package Panels.Sliders;

import Panels.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderPanel extends JPanel {
    private LabelledSlider rslide;
    private LabelledSlider gslide;
    private LabelledSlider bslide;

    public SliderPanel() {
        rslide = new LabelledSlider("R value for RGB",0, 255, Settings.redValue);
        gslide = new LabelledSlider("G value for RGB",0, 255, Settings.greenValue);
        bslide = new LabelledSlider("B value for RGB",0, 255, Settings.blueValue);


        String[] choices = { "Circle","Rectangle", "Square"};
        JComboBox<String> shapeList = new JComboBox<String>(choices);

        shapeList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Settings.shape = (String)shapeList.getSelectedItem();
            }
        });
        LabelledSlider sizeSlider = new LabelledSlider("Size", 0, 102, Settings.sizeValue);

        setLayout(new GridLayout(3, 2));
        this.add(rslide);
        this.add(gslide);
        this.add(bslide);
        this.add(sizeSlider);
        this.add(shapeList);
    }
}

