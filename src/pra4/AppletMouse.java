package pra4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class AppletMouse extends Applet implements MouseMotionListener {

	private Integer x = 0;
	private Integer y = 0;
	private String msg;
	Label label;
	Label rect;

	@Override
	public void init() {
		super.init();
		label = new Label();
		rect = new Label();
		rect.setBackground(Color.BLACK);
		setLayout(null);
		label.setBounds(0, 0, 200, 20);
		rect.setBounds(0, 0, 10, 10);
		add(label);
		add(rect);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Dragged is at ( " + x + " , " + y + " )";
		label.setText(msg);
		rect.setLocation(x, y);
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Moved is at ( " + x + " , " + y + " )";
		label.setText(msg);
		rect.setLocation(x, y);

	}

	
}
