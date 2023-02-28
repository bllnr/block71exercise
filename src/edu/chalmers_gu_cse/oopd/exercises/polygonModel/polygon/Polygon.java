package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.List;

public interface Polygon {
    // Calculating the center from a set of points.
    Polygon translate(int x, int y);
    Polygon rotate(double radians);
    Polygon scale(double x, double y);

    Point getCenterPoint();

    List<Point> getPoints();

 }
