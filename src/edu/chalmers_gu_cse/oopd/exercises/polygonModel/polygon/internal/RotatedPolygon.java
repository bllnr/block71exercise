package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.internal;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-02-28.
 */
class RotatedPolygon extends DecoratedPolygon {
    private double radians;

    RotatedPolygon(Polygon base, double radians) {
        super(base);
        this.radians = radians;
    }

    @Override
    public Polygon rotate(double radians) {
        this.radians += radians;
        return this;
    }

    @Override
    protected void manipulatePoint(Point center, Point p) {
        rotatePoint(center, p, this.radians);
    }
    private static void rotatePoint(Point center, Point point, double alpha) {
        double newX = center.x + (point.x - center.x) * Math.cos(alpha) - (point.y - center.y) * Math.sin(alpha);
        double newY = center.y + (point.x - center.x) * Math.sin(alpha) + (point.y - center.y) * Math.cos(alpha);
        point.x = (int) newX;
        point.y = (int) newY;
    }
}
