package com.Inheritance;

import java.awt.*;
import java.awt.event.*;

public class Anonymousinnerclass {

	private Frame f;

	public Anonymousinnerclass() {
		f = new Frame("Hello .....!");
	}

	public void launchFrame() {
		f.setSize(170, 170);
		f.setBackground(Color.blue);
		f.setVisible(true);
		// Add a window listener

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		}); // Anonymous Inner Classes

	}

	public static void main(String args[]) {
		Anonymousinnerclass f = new Anonymousinnerclass();
		f.launchFrame();
	}

}
