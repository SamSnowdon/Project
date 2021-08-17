import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

//Sam Snowdon and Ibrahim Manfoud

public class Display {

	JFrame frame;
	Canvas canvas;

	InputManager inputManager;

	public Display() {
		Dimension d = new Dimension(300, 600);
		frame = new JFrame();
		frame.setSize(d);
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.setLocation(200, 200);
		canvas = new Canvas();
		canvas.setPreferredSize(d);
		canvas.setMinimumSize(d);
		canvas.setMaximumSize(d);
		canvas.setFocusable(false);
		frame.add(canvas);
		frame.pack();
		inputManager = new InputManager(frame);
		frame.setVisible(true);
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public JFrame getJFrame() {
		return frame;
	}
}
