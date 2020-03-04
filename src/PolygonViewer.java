import javax.swing.*;
import java.awt.event.MouseListener;

/**
 * Created by Niklas on 2016-02-21.
 */
public class PolygonViewer extends JFrame implements AnimateListener {

    public PolygonViewer() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(30, 30, 300, 300);
        setVisible(true);
    }

    @Override
    public void actOnUpdate() {
        repaint();
    }
}
