package macro;


import polygon.*;

/**
 * Created by Niklas on 2016-03-02.
 */
@FunctionalInterface
public interface Transform {
    IPolygon transform(IPolygon polygon);
}
