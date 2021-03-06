/*
 * Timeline.java
 */

package game;

public class Timeline {

	/**
	 * The main class for the game, the backbone Everything leads back to here.
	 */

	public static void main(String[] args) {

		new Timeline().init();

	}

	public static Timeline instance;

	public static Timeline getInstance() {

		if (instance == null) {
			instance = new Timeline();
		}
		return instance;

	}

	String version = "V 1.0.0.0_0";

	private GUI gui = GUI.getInstance();

	public void init() {

		gui.drawGUI();

	}

	public String getVersion() {
		return version;
	}

}
