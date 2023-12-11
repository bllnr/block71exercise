package edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

/**
 * Created by Niklas on 2016-03-02.
 */
//@FunctionalInterface
public interface Transform {
    // TODO: Step 2a: What is the representation of a transform?
    Polygon transformPolygon(Polygon p, double radians, double doubleX, double doubleY, int intX, int intY);
}
