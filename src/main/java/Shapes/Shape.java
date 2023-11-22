package Shapes;

import java.awt.*;

public abstract class Shape {
    protected Point point;
    protected Color color;

    public Shape(Point pnt, Color col) {
        this.point = pnt;
        this.color = col;
    }

    public abstract void draw(Graphics g);
}