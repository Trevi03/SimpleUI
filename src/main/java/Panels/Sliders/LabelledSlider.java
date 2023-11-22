package Panels.Sliders;

import Panels.Sliders.SliderValue;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LabelledSlider extends JPanel {
    private JSlider slider;
    private SliderValue sliderValue;

    public LabelledSlider(String labeltext, int min, int max, SliderValue sliderval) {
        slider = new JSlider(min, max, sliderval.getValue());
        slider.setBorder(BorderFactory.createTitledBorder(labeltext));
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(51);

        this.sliderValue = sliderval;
        ChangeListener sliderListener= new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // When the value of the slider is changed, it updates the mutable object passed in
                sliderval.setValue(slider.getValue());
            }
        };
        slider.addChangeListener(sliderListener);
        this.add(slider);
    }
}
