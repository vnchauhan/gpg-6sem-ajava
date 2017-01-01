package extra.awt.applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class MyAppletAWT extends Applet {

	public void init() {
		setLayout(new GridLayout(6, 1));
		setVisible(true);
		setSize(500, 200);

		Panel p1 = new Panel();
		p1.setLayout(new FlowLayout());
		Label nameLabel = new Label("Name");
		TextField nameField = new TextField("Enter your name", 20);
		p1.add(nameLabel);
		p1.add(nameField);
		add(p1);

		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout());
		Label subLabel = new Label("Subjects");
		Checkbox s1 = new Checkbox("AJAVA");
		Checkbox s2 = new Checkbox("NMA");
		Checkbox s3 = new Checkbox("MCAD");
		p2.add(subLabel);
		p2.add(s1);
		p2.add(s2);
		p2.add(s3);
		add(p2);

		Panel p3 = new Panel();
		p3.setLayout(new FlowLayout());
		Label addLabel = new Label("Address");
		TextArea ta = new TextArea();
		p3.add(addLabel);
		p3.add(ta);
		add(p3);

		Panel p4 = new Panel();
		p4.setLayout(new FlowLayout());
		Label semLabel = new Label("Semester");
		Choice c = new Choice();
		c.addItem("Sem1");
		c.addItem("Sem2");
		c.addItem("Sem3");
		c.addItem("Sem4");
		c.addItem("Sem5");
		c.addItem("Sem6");
		p4.add(semLabel);
		p4.add(c);
		add(p4);

		Panel p5 = new Panel();
		p5.setLayout(new FlowLayout());
		Label genLabel = new Label("Gender");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cbm = new Checkbox("Male", cbg, false);
		Checkbox cbf = new Checkbox("Female", cbg, false);
		p5.add(genLabel);
		p5.add(cbm);
		p5.add(cbf);
		add(p5);

		Panel p6 = new Panel();
		p6.setLayout(new FlowLayout());
		Label semLabels = new Label("Exams");
		List lst = new List(3, true);
		lst.add("Sem1");
		lst.add("Sem2");
		lst.add("Sem3");
		lst.add("Sem4");
		lst.add("Sem5");
		lst.add("Sem6");
		p6.add(semLabels);
		p6.add(lst);
		add(p6);

	}

}
