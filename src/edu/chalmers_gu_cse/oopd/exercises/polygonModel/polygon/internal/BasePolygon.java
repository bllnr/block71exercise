package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.internal;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
class BasePolygon implements Polygon {
    private final List<Point> points;
    private final Point centerPoint;

    protected BasePolygon(List<Point> points){
        // defensive (deep) copying before storing away the list
        this.points = defensiveCopyPointList(points);
        this.centerPoint = calculateCenterPoint(points);
    }

    @Override
    public List<Point> getPoints() {
        // defensive copying of every point in list before
        // handing them out to a calling client
        return defensiveCopyPointList(this.points);
    }

    @Override
    public Point getCenterPoint() {
        return new Point(this.centerPoint);
    }

    @Override
    public Polygon translate(int x, int y) {
        return new TranslatedPolygon(this, x, y);
    }
    @Override
    public Polygon rotate(double radians) {
        return new RotatedPolygon(this, radians);
    }
    @Override
    public Polygon scale(double x, double y) {
        return new ScaledPolygon(this, x, y);
    }

    /* Simple static helper functions */
    // defensive copying of all points in a list
    private static List<Point> defensiveCopyPointList(List<Point> points) {
        List<Point> newList = new LinkedList<>();
        for (Point point : points){
            newList.add(new Point(point));
        }
        return newList;
    }


    private static Point calculateCenterPoint(List<Point> points) {
        int maxX = points.get(0).x, minX = points.get(0).x, maxY = points.get(0).y, minY = points.get(0).y;
        for (Point point : points) {
            maxX = Math.max(point.x, maxX);
            minX = Math.min(point.x, minX);
            maxY = Math.max(point.y, maxY);
            minY = Math.min(point.y, minY);
        }
        return new Point((maxX - minX) / 2 + minX, (maxY - minY) / 2 + minY);
    }
}
