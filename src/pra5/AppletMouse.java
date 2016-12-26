package pra5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppletMouse extends Applet implements MouseListener {

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
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Clicked is at ( " + x + " , " + y + " )";
		label.setText(msg);
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Entered is at ( " + x + " , " + y + " )";
		label.setText(msg);
	}

	@Override
	public void mouseExited(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Exited is at ( " + x + " , " + y + " )";
		label.setText(msg);
	}

	@Override
	public void mousePressed(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Pressed is at ( " + x + " , " + y + " )";
		label.setText(msg);
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		msg = "Mouse Released is at ( " + x + " , " + y + " )";
		label.setText(msg);
	}

}
