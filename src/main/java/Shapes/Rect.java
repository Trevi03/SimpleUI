package Shapes;

import Shapes.Shape;

import java.awt.*;


public class Rect extends Shape {
    private Integer width;
    private Integer height;
    //Shapes.Shapes.Rect(){}
    public Rect(int w, int h, Point pnt, Color col){
        super(pnt, col);
        this.width= w;
        this.height = h;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(point.x, point.y, width,height);
    }
}