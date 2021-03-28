package hw8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class jUnitTestCont {

	@Test
	void test() {
		PublisherImpl publisher = new PublisherImpl();
		Subscriber danger = new SubscriberEvens();
		Subscriber doug = new SubscriberEvens();
		Subscriber dan = new SubscriberEvens();
		publisher.registerSubscriber(danger);
		publisher.registerSubscriber(doug);
		publisher.registerSubscriber(dan);
		ArrayList<Subscriber> withdan = publisher.getSubscriber();
		boolean bool1 = false;
		boolean bool2 = true; 
		for (Subscriber tf : withdan)
		{
			if(tf==dan)
			{
				
				bool1=true;
			}
		}
		assertEquals(true,bool1);//means dan is in the list
	
		publisher.unregisterSubscriber(dan);
		for (Subscriber tf : withdan)
		{
			if(tf==dan)
			{
				
				bool2=false;
			}
		}
		assertEquals(true,bool2);//means dan is no longer in the list
	}

}
