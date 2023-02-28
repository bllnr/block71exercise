package edu.chalmers_gu_cse.oopd.exercises.view2d;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import java.awt.*;
import java.util.List;

public class DrawablePolygon extends Component implements Polygon {

    private Polygon wrappedPolygon;

    public DrawablePolygon(Polygon wrappedPolygon) {
        this.wrappedPolygon = wrappedPolygon;
    }

    // TODO 6: Instead use Visitor? Repository? Servant?
    public void paint(Graphics g){
        drawLinesBetweenCorners(g, getPoints());
    }

    private void drawLinesBetweenCorners(Graphics g, List<Point> corners) {
        // first and last point should be the same
        corners.add(corners.get(0));
        Point from = null;
        for (Point to : corners){
            if (from != null){
                g.drawLine(from.x, from.y, to.x, to.y);
            }
            from = to;
        }
    }

    @Override
    public Polygon translate(int x, int y) {
        wrappedPolygon = wrappedPolygon.translate(x, y);
        return this;
    }

    @Override
    public Polygon rotate(double radians) {
        wrappedPolygon = wrappedPolygon.rotate(radians);
        return this;
    }

    @Override
    public Polygon scale(double x, double y) {
        wrappedPolygon = wrappedPolygon.scale(x,y);
        return this;
    }

    @Override
    public Point getCenterPoint() {
        return wrappedPolygon.getCenterPoint();
    }


    @Override
    public List<Point> getPoints() {
        return wrappedPolygon.getPoints();
    }

}
