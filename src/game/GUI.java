package game;

import javax.swing.*;

import java.awt.*;

public class GUI {

	public static GUI instance;
	
	public static GUI getInstance() {
		
		if (instance == null) {
			instance = new GUI();
		}
		return instance;
		
	}
	
	JFrame f = new JFrame("Timeline");
	
	public void drawGUI() {

		f.setSize(500,500);
		f.setVisible(true);
		
	}

}
