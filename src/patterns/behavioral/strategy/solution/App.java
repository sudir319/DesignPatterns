package patterns.behavioral.strategy.solution;

public class App {

	public static void main(String[] args) {
		
		ImageManager manager = new ImageManager();
		manager.setRenderer(new SmartphoneRenderer());
		manager.show();
		
	}
}
