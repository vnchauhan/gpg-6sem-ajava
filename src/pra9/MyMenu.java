package pra9;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Create an application that displays a frame with a menubar. When a user
 * selects any menu or menu item, display that selection on a text area in the
 * center of the frame
 * 
 * @author Government Polytechnic, Gandhinagar
 *
 */
public class MyMenu extends Frame {
	Label menuSelected = new Label("No Menu selected         ");

	public MyMenu() {

		setTitle("MenuTest");

		// create a menu bar
		final MenuBar menuBar = new MenuBar();

		// create menus
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");

		// create menu items
		MenuItem newMenuItem = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N));
		newMenuItem.setActionCommand("New");

		MenuItem openMenuItem = new MenuItem("Open");
		openMenuItem.setActionCommand("Open");

		MenuItem saveMenuItem = new MenuItem("Save");
		saveMenuItem.setActionCommand("Save");

		MenuItem exitMenuItem = new MenuItem("Exit");
		exitMenuItem.setActionCommand("Exit");

		MenuItem cutMenuItem = new MenuItem("Cut");
		cutMenuItem.setActionCommand("Cut");

		MenuItem copyMenuItem = new MenuItem("Copy");
		copyMenuItem.setActionCommand("Copy");

		MenuItem pasteMenuItem = new MenuItem("Paste");
		pasteMenuItem.setActionCommand("Paste");

		MenuItemListener menuItemListener = new MenuItemListener();

		newMenuItem.addActionListener(menuItemListener);
		openMenuItem.addActionListener(menuItemListener);
		saveMenuItem.addActionListener(menuItemListener);
		exitMenuItem.addActionListener(menuItemListener);
		cutMenuItem.addActionListener(menuItemListener);
		copyMenuItem.addActionListener(menuItemListener);
		pasteMenuItem.addActionListener(menuItemListener);

		// add menu items to menus
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();

		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);

		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);

		// add menu to menubar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);

		// add menubar to the frame
		setMenuBar(menuBar);
		add(menuSelected);

		setLayout(new FlowLayout());
		setSize(400, 200);
		setVisible(true);

	}

	public static void main(String args[]) {
		new MyMenu();
	}

	class MenuItemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuSelected.setText(e.getActionCommand() + " MenuItem clicked.");
		}
	}
}
