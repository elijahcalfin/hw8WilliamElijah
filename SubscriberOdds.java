package hw8;

public class SubscriberOdds implements Subscriber{
	
	public int threshold=21;
	public int eventsHandled=0;

	public SubscriberOdds() {}
	
	public boolean notifysubscriber(Event e) {
		if (Event.getEventDataValue() %2 != 0) {
	         eventsHandled=eventsHandled+1;	         
	         if(eventsHandled<threshold) {
	        	 System.out.println("SubscriberOdds Event " + e.getEventSeqNum() + " is odd: " + Event.getEventDataValue());
	        	 return true; 
	         }
	        if(eventsHandled>=threshold) {
	        	if(eventsHandled%40==0) {
	        		eventsHandled = 0;
	        		return false;
	        	}
	        }
		 }
		return false;   
	    }

}