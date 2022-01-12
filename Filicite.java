import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Filicite extends JComponent {

	public static void outbond(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D.Double r = new Rectangle2D.Double(70, 100, 68, 12);
		g2d.setcolor(Color.BLUE);
		g2d.fill(r);

		Line2D.Double line = new Line2D.Double(44, 14, 78, 117);
		g2d.setcolor(Color.GREEN);
		g2d.draw(line);

		Line2D.Double line = new Line2D.Double(28, 112, 28, 112);
		g2d.setcolor(Color.magenta);
		g2d.draw(line);

	}
}





