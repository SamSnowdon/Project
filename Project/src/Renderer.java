import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

//Sam Snowdon and Ibrahim Manfoud

public class Renderer {

	private BufferStrategy bufferStrategy;
	private Graphics2D g;

	public Renderer() {

	}

	void render(Canvas canvas) {
		bufferStrategy = canvas.getBufferStrategy();
		if (bufferStrategy == null) {
			canvas.createBufferStrategy(3);
			return;
		}
		g = (Graphics2D) bufferStrategy.getDrawGraphics();
		g.clearRect(0, 0, 300, 600);

		g.setColor(Color.white);
		g.drawImage(Assets.imageList.get(8), 0, 0, null);
		Target.render(g);
		g.drawImage(Assets.imageList.get(9), 0, 0, null);

		bufferStrategy.show();
		g.dispose();
	}
}
