package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro.Transform;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* package-private */ class PolygonSet implements Iterable<Polygon> {
    // TODO 5: For more challenge:
    //  Implement a Composite Pattern for PolygonSet, making it
    //  implement the Polygon interface. What issues do you run into?
    //  How can you work around them?
    private List<Polygon> polygons = new ArrayList<>();
    public void addPolygon(Polygon p){
        polygons.add(p);
    }

    public void translate(int x, int y){
        transformSet(p -> p.translate(x,y));
    }

    public void transformSet(Transform transform) {
        // Transforms using stream processing. Not the prettiest,
        // converting back and forth to lists; can you rework the
        // entire PolygonSet to work with streams instead of lists?
        this.polygons = polygons.stream().map(transform).collect(Collectors.toList());
    }

    @Override
    public Iterator<Polygon> iterator() {
        return polygons.iterator();
    }

}
