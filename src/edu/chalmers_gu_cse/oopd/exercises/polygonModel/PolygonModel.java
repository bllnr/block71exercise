package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro.Transform;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.IPolygon;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-02-21.
 *
 * A PolygonModel combines the functionality of a PolygonSet, that
 * can be updated with new polygons; and a PolygonSetAnimator that
 * can update the position of the polygons over time.
 */
public class PolygonModel extends JComponent {

    // TODO: PubSub Pattern: Create several separate polygon sets,
    //  and let each set have its own dedicated Publisher. Make
    //  good use of these Publishers, by differentiating outputs.

    private final PolygonSet polygonSet;
    private final PolygonSetAnimator animator;

    public PolygonModel() {
        polygonSet = new PolygonSet();
        animator = new PolygonSetAnimator(polygonSet);
    }//constructor

    // Delegate these methods to the polygon set
    public void addPolygon(IPolygon p){
        polygonSet.addPolygon(p);
        animator.notifyListeners();
    }
    // !!! This still breaks the MVC pattern! This should be part of the view2d package.
    public void paint(Graphics g) {
        polygonSet.paint(g);
    }

    // Delegate these methods to the animator
    public void animate(Transform transform){
        animator.animate(transform);
    }
    public void addListener(ModelUpdateListener l){
        animator.addListener(l);
    }
}

