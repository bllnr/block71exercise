package macro;

import polygon.IPolygon;

/**
 * Created by Niklas on 2016-03-02.
 */
public class ExampleTransform implements Transform {
    @Override
    public IPolygon transform(IPolygon polygon) {
        return polygon.rotate(5);
    }
}
