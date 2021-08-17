//Sam Snowdon and Ibrahim Manfoud
public class Game {
	
	GameManager gameManager;

	public Game() {
		gameManager = new GameManager();
	}
	
	void run() {
		gameManager.start();
	}
}
