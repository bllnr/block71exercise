package macro;

import polygon.IPolygon;

import java.util.*;

/**
 * Created by Niklas on 2016-03-02.
 */
public class Macro implements Transform {
    private List<Transform> transforms = new ArrayList<>();

    public void addTransform(Transform t) {
        transforms.add(t);
    }

    @Override
    public IPolygon transform(IPolygon polygon) {
        IPolygon result = polygon;
        for (Transform someTransform : transforms) {
            result = someTransform.transform(result);
        }
        return result;
    }
}