package patterns.behavioral.observer;

public interface Subject {
	public void addObserver(Observer o);
	public void notifyAllObserver();
}
