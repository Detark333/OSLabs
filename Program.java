package OSJavaLab2;
import java.util.ArrayList;
public class Program {

	private ArrayList<Process> processes;

	public Program() {

		int processesCount = (int) (Math.random() * 4 + 3);
		processes = new ArrayList<Process>();
		for (int i = 0; i < processesCount; i++) {
			processes.add(new Process("" + i));
		}
	}

	public void start() {


		while (!processes.isEmpty()) {
			int i = 0;

			while (i < processes.size()) {			

					int allottedTime = 500;

					boolean isProcessClosed = processes.get(i).invoke(allottedTime);

					if (isProcessClosed) {
						processes.remove(i);
						i--;
					}

				i++;
			}
		}

	}


}
