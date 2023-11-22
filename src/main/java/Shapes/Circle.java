package Shapes;

import Shapes.Shape;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int rad, Point pnt, Color col){
        super(pnt, col);
        this.radius = rad;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(point.x,point.y,radius,radius);
    }

}
