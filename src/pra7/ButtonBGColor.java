package pra7;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a program that has only one button in the frame, clicking on the button
 * cycles through the colors: red->green->blue-> and so on.one color change per
 * click. (usegetBackGround() method to get the current color)
 * 
 * @author Government Polytechnic, Gandhinagar
 *
 */
public class ButtonBGColor extends Frame {
	Color[] colors = new Color[] { Color.RED, Color.GREEN, Color.BLUE };

	public ButtonBGColor() {
		Button b = new Button("Click Me");

		b.addActionListener(new ActionListener() {
			private Integer i = 0;

			@Override
			public void actionPerformed(ActionEvent mv) {
				b.setBackground(colors[i % colors.length]);
				i++;
			}
		});

		add(b);
		setLayout(new FlowLayout());
		setSize(200, 200);
		setVisible(true);

	}

	public static void main(String args[]) {
		new ButtonBGColor();
	}
}
