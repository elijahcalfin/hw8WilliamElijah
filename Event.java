package hw8;

public class Event {

	private int EventSequenceNum;
	private static int EventDataValue;
	
	public Event(int eventNumber, int eventData) {
		EventSequenceNum = eventNumber;
		EventDataValue = eventData;
    }
	public int getEventSeqNum(){
		return EventSequenceNum;
	}
	public static int getEventDataValue() {
		return EventDataValue;
	}
}