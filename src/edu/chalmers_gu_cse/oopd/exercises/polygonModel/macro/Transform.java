package edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import java.util.function.Function;

/**
 * Created by Niklas on 2016-03-02.
 */
@FunctionalInterface
public interface Transform extends Function<Polygon, Polygon> {
    Polygon apply(Polygon polygon);
}
