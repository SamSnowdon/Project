import java.awt.Graphics2D;
import java.util.ArrayList;

//Sam Snowdon and Ibrahim Manfoud

public class Target {

	static ArrayList<Target> targetList = new ArrayList<Target>();
	static ArrayList<Target> removalList = new ArrayList<Target>();

	static int score = 0, missed = 0, streak = 0, tickDelay = 55, tickCounter = 0;
	static float difficultySpeed = 1f;

	int targetType, x;
	float y = 600f;
	boolean hasBeenChecked = false;

	public Target() {
		generateTarget();
	}

	void generateTarget() {
		targetType = (int) (Math.random() * 4.0);
		if (targetType == 0) {
			x = 20;
		} else if (targetType == 1) {
			x = 70;
		} else if (targetType == 2) {
			x = 120;
		} else if (targetType == 3) {
			x = 170;
		}
		targetList.add(this);
	}

	static void tick() {
		if (tickCounter == tickDelay) {
			tickCounter = 0;
			createNewTarget();
		}
		for (Target target : targetList) {
			target.y -= difficultySpeed;
			if (target.y <= -42) {
				removalList.add(target);
			}
			if (target.y <= 25 && !target.hasBeenChecked) {
				if (target.targetType < 4)
					target.targetType += 4;
				if (InputManager.arrowsPressed[target.targetType - 4]) {
					score++;
					streak++;
					target.hasBeenChecked = true;
				}
			}
			if (target.y <= 0 && !target.hasBeenChecked) {
				missed++;
				streak = 0;
				target.hasBeenChecked = true;
			}
		}
		for (Target target : removalList) {
			targetList.remove(target);
		}
		removalList.clear();
		tickCounter++;
	}

	static void render(Graphics2D g) {
		int x = 20;
		for (int i = 4; i < 8; i++) {
			g.drawImage(Assets.imageList.get(i), x, 10, 40, 40, null);
			x += 50;
		}
		g.drawImage(Assets.imageList.get(4), 20, 10, 40, 40, null);
		g.drawImage(Assets.imageList.get(4), 20, 10, 40, 40, null);

		for (Target target : targetList) {
			g.drawImage(Assets.imageList.get(target.targetType), target.x, (int) target.y, 40, 40, null);
		}
		g.drawString("Score: " + score, 220, 20);
		g.drawString("Streak: " + streak, 220, 35);
		g.drawString("Missed: " + missed, 220, 50);
	}

	static void createNewTarget() {
		new Target();
	}
}
