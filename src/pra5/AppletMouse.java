package pra5;

import java.applet.Applet;
import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppletMouse extends Applet {

	Button btn;
	Integer i = 0;

	@Override
	public void init() {
		super.init();

		btn = new Button("Init");

		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

				if (i % 2 == 0)
					btn.setLabel("Start");
				else
					btn.setLabel("stop");
				i++;

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		add(btn);

	}

}
