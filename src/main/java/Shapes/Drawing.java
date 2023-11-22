package Shapes;

import Panels.Settings;
import Shapes.Circle;
import Shapes.Rect;
import Shapes.Shape;
import Shapes.Square;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class Drawing extends Canvas {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Drawing() {
        setBackground(Color.white);
        shapes.add(new Circle(50, new Point(50, 50), Color.red));
        shapes.add(new Rect(100, 60, new Point(150, 100), Color.blue));
        shapes.add(new Square(10, new Point(150, 40), Color.green));

        setMouseListener();
    }


    private void setMouseListener() {
            addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int sz = Settings.sizeValue.getValue();
                    Point p = e.getPoint();
                    Shape s = null;
                    Color c = new Color(Settings.redValue.getValue(),Settings.greenValue.getValue(),Settings.blueValue.getValue());
                    switch (Settings.shape) {
                        case "Circle":
                            s = new Circle(sz, p, c);
                            break;
                        case "Square":
                            s = new Square(sz, p, c);
                            break;
                        case "Rectangle":
                            s = new Rect(2*sz, sz, p, c);
                            break;
                    }
                    shapes.add(s);
                    repaint();
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

        }

    public void paint(Graphics g){
        for (int i=0; i<=shapes.size();i++){
            shapes.get(i).draw(g);
        }
    }
}