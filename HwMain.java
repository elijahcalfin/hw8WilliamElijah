package hw8;

public class HwMain {

	public static void main(String[] args) {
		
		PublisherImpl publisher = new PublisherImpl();
		
//		Subscriber odds = new SubscriberOdds();
//		publisher.registerSubscriber(odds);
//		Subscriber threes = new SubscriberThrees();
//        publisher.registerSubscriber(threes);
//        
		Subscriber evens = new SubscriberEvens();
        publisher.registerSubscriber(evens);
        
                
        
        publisher.runSimulation();

	}
}