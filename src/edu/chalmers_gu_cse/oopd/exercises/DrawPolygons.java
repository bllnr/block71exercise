package edu.chalmers_gu_cse.oopd.exercises;

/* Model */
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.PolygonModel;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.PolygonFactory;
import edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro.Macro;

/* View */
import edu.chalmers_gu_cse.oopd.exercises.view2d.PolygonViewer;

/* Controller */
import edu.chalmers_gu_cse.oopd.exercises.controller.PolygonClicker;

/* By commenting out the imports above, and instead importing the edu.chalmers_gu_cse.oopd.edu.chalmers_gu_cse.oopd.exercises.polygonModel.adapter package,
 * we effectively switch to using the DIT952.edu.chalmers_gu_cse.oopd.edu.chalmers_gu_cse.oopd.exercises.polygonModel.shapes package.
 */
// import DIT952.edu.chalmers_gu_cse.oopd.edu.chalmers_gu_cse.oopd.exercises.polygonModel.adapter.*;

public class DrawPolygons {

    public static void main(String[] args) {
        PolygonModel polygons = initModel();
        PolygonViewer view = initViewForModel(polygons);
        PolygonClicker controller = initClickerForView(polygons, view);

        Macro macro = setupAnimationMacro();
        polygons.animate(macro);
    }//main

    private static Macro setupAnimationMacro() {
        Macro macro = new Macro();
        macro.addTransform(p -> p.rotate(0.1));
        macro.addTransform(p -> p.scale(1.1, 1.1));
        macro.addTransform(p -> p.translate(10,10));
        return macro;
    }

    private static PolygonModel initModel(){
        PolygonModel polygons = new PolygonModel();

        polygons.addPolygon(PolygonFactory.createSquare(50,50));
        polygons.addPolygon(PolygonFactory.createTriangle(100,100));
        polygons.addPolygon(PolygonFactory.createRectangle(50,150));

        return polygons;
    }//initModel

    private static PolygonViewer initViewForModel(PolygonModel polygonModel) {
        PolygonViewer view = new PolygonViewer();
        view.addModel(polygonModel);
        polygonModel.addListener(view);
        return view;
    }//initViewForModel

    private static PolygonClicker initClickerForView(PolygonModel polygons, PolygonViewer view) {
        return new PolygonClicker(polygons, view);
    }


}//edu.chalmers_gu_cse.oopd.exercises.DrawPolygons