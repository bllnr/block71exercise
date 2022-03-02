package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro.Macro;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro.Transform;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.IPolygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/* package-private */ class PolygonSet extends JComponent {
    private List<IPolygon> polygons = new ArrayList<>();
    public void addPolygon(IPolygon p){
        polygons.add(p);
    }

    public void paint(Graphics g){
        for (IPolygon polygon : polygons) {
            polygon.paint(g);
        }
    }

    public void translate(int x, int y){
        Macro translateMacro = new Macro();
        translateMacro.addTransform(p -> p.translate(x,y));
        transformSet(translateMacro);
    }

    public void transformSet(Transform transform) {
        List<IPolygon> transformed = new ArrayList<>();
        for (IPolygon p : polygons) {
            IPolygon q = transform.transform(p);
            transformed.add(q);
        }
        this.polygons = transformed;
    }
}
