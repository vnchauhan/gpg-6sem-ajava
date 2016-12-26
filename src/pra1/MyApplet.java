package pra1;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	private Integer radius = 100;

	public void paint(Graphics g) {
		setSize(500, 300);
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
	}

}
