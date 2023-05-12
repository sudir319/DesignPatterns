package patterns.behavioral.strategy.solution;

public class TVRenderer implements Renderer {

	@Override
	public void showImage() {
		System.out.println("Showing an image on TV...");
	}
}
