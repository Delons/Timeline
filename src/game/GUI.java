package game;

import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.util.Timer;

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

		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(Paint.getInstance());

		update.schedule(updateGame, 1000 / 60, 1000 / 60);

	}

	private Timer update = new Timer();

	TimerTask updateGame = new TimerTask() {
		public void run() {
			
			//Adjust Size
			
			//Repaint
			f.repaint();
		}
	};

}
