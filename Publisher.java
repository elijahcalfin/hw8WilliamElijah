package hw8;

public interface Publisher {

	public void notifySubscribers(Event e);
	public void registerSubscriber(Subscriber s);
	public void unregisterSubscriber(Subscriber s);
	
}