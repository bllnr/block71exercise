package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.internal;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.IPolygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-02-28.
 */
class ScaledPolygon extends ManipulatedPolygon implements IPolygon {
    double xFactor, yFactor;

    ScaledPolygon(AbstractPolygon base, double xFactor, double yFactor) {
        super(base);
        this.xFactor = xFactor;
        this.yFactor = yFactor;
    }

    @Override
    public AbstractPolygon scale(double x, double y) {
        this.xFactor *= x;
        this.yFactor *= y;
        return this;
    }

    protected void manipulatePoint(Point center, Point point) {
        double newX = (point.x-center.x)*xFactor + center.x;
        double newY = (point.y-center.y)*yFactor + center.y;
        point.x = (int) newX;
        point.y = (int) newY;
    }
}
