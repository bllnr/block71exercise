package edu.chalmers_gu_cse.oopd.exercises.view2d;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.ModelUpdateListener;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.PolygonModel;

import javax.swing.*;
import java.awt.event.MouseListener;

/**
 * Created by Niklas on 2016-02-21.
 */
public class PolygonViewer implements ModelUpdateListener {

    private final JFrame viewFrame = new JFrame();

    public PolygonViewer() {
        viewFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        viewFrame.setBounds(30, 30, 300, 300);
        viewFrame.setVisible(true);
    }

    @Override
    public void actOnModelUpdate() {
        viewFrame.repaint();
    }

    // Delegate to the JFrame, so clients don't need to depend directly on that frame
    public void addModel(PolygonModel model) {
        viewFrame.add(model);
    }
    public void addMouseListener(MouseListener ml) {
        viewFrame.addMouseListener(ml);
    }
}
