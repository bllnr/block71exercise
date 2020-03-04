package polygon;

import java.awt.*;

/**
 * Created by Niklas on 2016-03-01.
 */
public interface IPolygon {
    public IPolygon translate(int x, int y);
    public IPolygon rotate(double radians);
    public IPolygon scale(double x, double y);

    public Point getCenterPoint();
}
