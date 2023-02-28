package edu.chalmers_gu_cse.oopd.exercises.view2d;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.ModelUpdateListener;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.PolygonModel;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-02-21.
 */
public class PolygonViewer extends JPanel implements ModelUpdateListener {

    public void addModel(PolygonModel model) {
        for (Polygon p : model) {
            actOnPolygonAdded(p);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (Component c : getComponents()) {
            c.paint(g);
        }

    }

    @Override
    public void actOnModelUpdate() {
        repaint();
    }

    @Override
    public void actOnPolygonAdded(Polygon p) {
        add(new DrawablePolygon(p));
    }

}
