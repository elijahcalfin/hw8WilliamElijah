package hw8;

public class SubscriberThrees implements Subscriber {
	
	public int threshold=10;
	public int eventsHandled=0;
	
	public SubscriberThrees() {}
	
	 public boolean notifysubscriber(Event e) {
		 if (Event.getEventDataValue() %3 == 0) {
	         eventsHandled=eventsHandled+1;	         
	         if(eventsHandled<threshold) {
	        	 System.out.println("SubscriberThrees Event " + e.getEventSeqNum() + " is divisible by 3: " + Event.getEventDataValue());
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