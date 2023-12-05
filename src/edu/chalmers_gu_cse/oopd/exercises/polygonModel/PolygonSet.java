package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro.Transform;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* package-private */ class PolygonSet implements Iterable<Polygon> {
    // TODO 6: For more challenge:
    //  Implement a Composite Pattern for PolygonSet, making it
    //  implement the Polygon interface. What issues do you run into?
    //  How can you work around them?
    private List<Polygon> polygons = new ArrayList<>();
    public void addPolygon(Polygon p){
        polygons.add(p);
    }

    public void translate(int x, int y){
        List<Polygon> translated = new ArrayList<>();
        for (Polygon p : polygons) {
            Polygon q = p.translate(x,y);
            translated.add(q);
        }
        this.polygons = translated;
    }

    @Override
    public Iterator<Polygon> iterator() {
        return polygons.iterator();
    }

}
