package edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

/**
 * Created by Niklas on 2016-03-02.
 */
public class ExampleTransform implements Transform {
    // TODO: Step 2b: Implement an example of a Transform class

    @Override
    public Polygon transformPolygon(Polygon p, double radians, double doubleX, double doubleY, int intX, int intY) {
        p.rotate(radians);
        p.scale(doubleX, doubleY);
        p.translate(intX,intY);
        return p;
    }
}
