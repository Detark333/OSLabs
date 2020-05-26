package OSJavaLab2;
import java.util.ArrayList;
public class Process {

	private String name;
	private ArrayList<Thread> threads;

	public Process(String name) {

		this.name = name;

		threads = new ArrayList<Thread>();
		int threadsCount = (int) (Math.random() * 5 + 1);
		for (int i = 0; i < threadsCount; i++) {
			threads.add(new Thread("" + i));
		}
	}

	public boolean invoke(int allottedTime) {
		log("  Íà âûïîëíåíèè ïðîöåññ " + name + " ñ ïðèîðèòåòîì " );



		for (int i = 0; i < threads.size(); i++) {
			boolean isThreadClosed = threads.get(i).invoke(allottedTime);

			if (isThreadClosed) {
				threads.remove(i);
				i--;
			}
		}

		if (threads.isEmpty()) {
			log("  Ïîòîêîâ íå îñòàëîñü");
			return true;
		} else {
			return false;
		}
	}

	private void log(String message) {
		System.out.println( message);
	}
}
