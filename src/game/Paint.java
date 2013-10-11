package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Paint extends JPanel {

	public static Paint paint;

	public static Paint getInstance() {
		if (paint == null) {
			paint = new Paint();
		}
		return paint;
	}

	private int lastTime, currentTime, fps;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		
		lastTime = currentTime;
		currentTime = (int) System.currentTimeMillis();
		if (currentTime - lastTime != 0) {
			fps = 1000 / (currentTime - lastTime);
		}

		
		//Draw Background
		g.setColor(new Color(97, 161, 201));
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//Menu
	
		
		// Draw Stats

		g.setColor(Color.black);
		g.drawString("FPS: " + fps, 5, 15);

	}
	
	public void drawButton(Graphics g, String text, int x, int y){
		
		g.setColor(Color.black);
		g.drawRect(x, y, 150, 30);
		
		g.setColor(Color.lightGray);
		g.fillRect(x + 1, y + 1, 149, 29);
		
		g.setColor(Color.black);
		g.drawString(text, x + 5, y + 15);
		
	}

}
