package hw8;

public class SubscriberEvens implements Subscriber{
	
	public int threshold=14;
	private int eventsHandled =0;
	public boolean x;
	
	public SubscriberEvens() {}
	
	 public boolean notifysubscriber(Event e) {
        
		 if (Event.getEventDataValue() %2 == 0) {
			 eventsHandled=eventsHandled+1; 
	         
	         if(eventsHandled<threshold) {
	        	 System.out.println("SubscriberEvens Event " + e.getEventSeqNum() + " is even: " + Event.getEventDataValue());
	        	 return true;
	         }
	        if(eventsHandled>=threshold) {
	        	if(eventsHandled==40) {
	        		//System.out.println("40 reached: "+e.getEventSeqNum());
	        		eventsHandled = 0;
	        		return true;
	        	}
	        	else {
	        		//System.out.println("above threshold:"+e.getEventSeqNum());
	        		return false;
	        	}
	        		
	        }
		 }
		 return false;
	 }
}