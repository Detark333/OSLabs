package OSJavaLab2;

public class Thread {
	private Timer timer;
	private String name;
	private int time;
	private int priority;

	public Thread(String name, int priority, Timer timer) {
		this.timer = timer;

		this.name = name;
		time = (int) (Math.random() * 500 + 1);
		this.priority = priority;
	}

	public boolean invoke(int allottedTime) {
		log("Íà âûïîëíåíèè ïîòîê " + name + " ñ ïðèîðèòåòîì " + priority);

		if (time > allottedTime) {
			time -= allottedTime;
			timer.addTime(allottedTime);

			log("  Äî çàâåðøåíèÿ ïîòîêà îòàëîñü " + time);

			return false;
		} else {
			timer.addTime(time);

			log("  Ïîòîê çàâåðø¸í");

			return true;
		}
	}

	private void log(String message) {
		System.out.println(timer.getTime() + "  :  " + message);
	}

	public int getPriority() {
		return priority;
	}
}
