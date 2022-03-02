package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;

public interface IPolygon {
    IPolygon translate(int x, int y);
    IPolygon rotate(double radians);
    IPolygon scale(double x, double y);

    Point getCenterPoint();

    // Still an issue with MVC!!
    void paint(Graphics g);

}
