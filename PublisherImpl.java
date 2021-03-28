package hw8;

import java.util.ArrayList;
import java.util.Random;

public class PublisherImpl implements Publisher{
	private ArrayList<Subscriber> subscribers= new ArrayList<Subscriber>();
	
	//arraylist to contain returns for true and false results
	public ArrayList<Boolean> boolin = new ArrayList<Boolean>();
	//notify sub value
	Subscriber z = new SubscriberEvens();
	
	public PublisherImpl() {}
	
	public void notifySubscribers(Event e) {
		for (Subscriber s: subscribers) {
			s.notifysubscriber(e);
		}	
	}
	public void registerSubscriber(Subscriber s) {
		subscribers.add(s);
	}
	public void unregisterSubscriber(Subscriber s) {
		subscribers.remove(s);
	}
	//for purposes of testing
	public ArrayList<Subscriber> getSubscriber() {
		return subscribers;
	}

	 private Event generateEvent(int eNum, int eData) {
		 Event e = new Event(eNum, eData);
	     return e;
	    }
	 public void runSimulation() {
		 for(int i=1;i<=200;i++) {
			 Random rand = new Random();
	         int randInt = rand.nextInt(200);
	         Event e = generateEvent(i, randInt);
	         notifySubscribers(e);
		 }

	 }
	 //specifically
	 public ArrayList<Boolean> runSimulationEvenTest() {
		 for(int i=1;i<=200;i++) {
			 Random rand = new Random();
	         int randInt = rand.nextInt(200);
	         Event e = generateEvent(i, randInt);
	         //notifySubscribers(e);
	         Boolean booler = z.notifysubscriber(e);
	         boolin.add(booler);
		 }
		 return boolin;
	 }
	 
}
