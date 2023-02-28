package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

/**
 * Created by Niklas on 2016-02-24.
 */
public interface ModelUpdateListener {
    void actOnModelUpdate();
    void actOnPolygonAdded(Polygon p);
}
