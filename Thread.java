package OSJavaLab2;

public class Thread {
	private String name;
	private int time;

	public Thread(String name) {
		this.name = name;
		time = (int) (Math.random() * 500 + 1);

	}

	public boolean invoke(int allottedTime) {
		log("Íà âûïîëíåíèè ïîòîê " + name);

		if (time > allottedTime) {
			time -= allottedTime;

			log("  Äî çàâåðøåíèÿ ïîòîêà îòàëîñü " + time);

			return false;
		} else {

			log("  Ïîòîê çàâåðø¸í");

			return true;
		}
	}

	private void log(String message) {
		System.out.println(message);
	}

}
