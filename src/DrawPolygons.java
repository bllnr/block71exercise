

import macro.Macro;
import polygon.*;

public class DrawPolygons {

    public static PolygonModel initPolygons(){
        Macro macro = new Macro();
        macro.addTransform(x -> x.translate(1,1));
        macro.addTransform(x -> x.rotate(0.1));
        macro.addTransform(x -> x.scale(1.1,1.1));

        PolygonModel polygons = new PolygonModel(macro);

        polygons.addPolygon(PolygonFactory.createSquare(50,50));
        polygons.addPolygon(PolygonFactory.createTriangle(100,100));
        polygons.addPolygon(PolygonFactory.createRectangle(50,150));

        return polygons;

    }//initializer

    public static void main(String[] args) {
        PolygonModel polygons = initPolygons();
        PolygonViewer view = new PolygonViewer();
        view.add(polygons);
        polygons.addListener(view);
        PolygonController controller = new PolygonController(polygons, view);

        polygons.animate();

    }//main

}//DIT952.DrawPolygons