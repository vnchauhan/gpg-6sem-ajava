


import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Write an applet that contains three check boxes and 30 x 30 pixel canvas. The
 * three checkboxes should be labeled “Red”, ”Green”, ”Blue”. The selection of
 * the check boxes determine the color of the canvas. For example, if the user
 * selects both “Red” and “Blue”, the canvas should be purple.
 * 
 * @author Government Polytechnic, Gandhinagar
 *
 */

/*<Applet code="MyCanvas.class" height=200 width=200></Applet>*/

public class MyCanvas_pra8 extends Applet implements ItemListener {
	Color[] colors = new Color[] { Color.RED, Color.GREEN, Color.BLUE };
	Checkbox red = null;
	Checkbox green = null;
	Checkbox blue = null;
	Canvas c = null;

	public void init() {
		setLayout(new FlowLayout());
		setSize(200, 200);
		setVisible(true);

		red = new Checkbox("Red");
		green = new Checkbox("Green");
		blue = new Checkbox("Blue");
		red.addItemListener(this);
		green.addItemListener(this);
		blue.addItemListener(this);

		c = new Canvas();
		c.setSize(30, 30);
		c.setBackground(Color.RED);

		add(red);
		add(green);
		add(blue);
		add(c);

	}

	public void paint(Graphics gr) {

		int r = 0;
		int g = 0;
		int b = 0;

		if (red.getState())
			r = Color.red.getRed();
		if (green.getState())
			g = Color.green.getGreen();
		if (blue.getState())
			b = Color.blue.getBlue();
		Color cr = new Color(r, g, b);
		c.setBackground(cr);

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		repaint();

	}

}
