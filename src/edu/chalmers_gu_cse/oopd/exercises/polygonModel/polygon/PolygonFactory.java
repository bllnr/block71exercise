package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.internal.PolygonBuilder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {
    // TODO: Abstract Factory: Define an interface for factories. Create a few different
    //  concrete instances of factories. Show that you can let the client (DrawPolygons)
    //  choose which factory to be used, by passing it to the initial PolygonModel, and
    //  to the PolygonClicker (should the model and the Clicker depend on the same Factory?

    private static final int[][] rectangleOffsets = { {-20,-10}, {20,-10}, {20,10}, {-20,10}};
    private static final int[][] triangleOffsets = { {0,-10}, {10,10}, {-10,10}};
    private static final int[][] squareOffsets = { {-10,-10}, {10,-10}, {10,10}, {-10,10}};

    public static IPolygon createRectangle(int x, int y){
        return createPolygon(x, y, rectangleOffsets);
    }
    public static IPolygon createTriangle (int x, int y){
        return createPolygon(x, y, triangleOffsets );
    }
    public static IPolygon createSquare   (int x, int y){
        return createPolygon(x, y, squareOffsets   );
    }

    // Private static helper methods
    private static IPolygon createPolygon(int x, int y, int[][] offsets) {
        return PolygonBuilder.buildPolygon(basePoints(offsets)).translate(x,y);
    }
    private static List<Point> basePoints(int[][] offsets) {
        List<Point> points = new ArrayList<>();
        for (int[] xy : offsets) {
            points.add(new Point(xy[0], xy[1]));
        }
        return points;
    }
}
