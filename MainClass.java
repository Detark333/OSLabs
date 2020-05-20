package OSJavaLab2;

public class MainClass {
	public static void main(String[] args) {
		Timer timer = new Timer();
		Program manager = new Program(timer);
		manager.start();
	}
}
