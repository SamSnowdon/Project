//Sam Snowdon and Ibrahim Manfoud
public class GameManager {

	boolean running = true;

	Display display;
	Renderer renderer;

	public GameManager() {
		Assets.init();
		display = new Display();
		renderer = new Renderer();
	}

	void tick() {
		Target.tick();
		render();
	}

	void render() {
		renderer.render(display.getCanvas());
	}

	public void start() {
		double tickRate = 144.0;
		double timePerTick = 1000.0 / tickRate;
		double delta = 0.0;
		long now;
		long lastTime = System.currentTimeMillis();
		while (running) {
			now = System.currentTimeMillis();
			delta += (now - lastTime) / timePerTick;
			lastTime = now;
			if (delta >= 1) {
				tick();
				delta--;
			}
		}
	}
}
