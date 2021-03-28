package hw8;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class jUnitTest {

	@Test
	void test() {
		PublisherImpl publisher = new PublisherImpl();
		Subscriber evens = new SubscriberEvens();
		publisher.registerSubscriber(evens);
		ArrayList<Boolean> list = publisher.runSimulationEvenTest();
		ArrayList<Boolean> list2 = list;
        int counter = 0;
        int truecounter = 0;
        int counter2=0;
        int truecounter2=0;
        Boolean test = null;
        Boolean test2 = null;
        for (Boolean tf : list) {
            if(tf==true){truecounter = truecounter+1;}
        	if(truecounter>=40)
        	{test=list.get(counter);
	        	truecounter = 0;}
            counter = counter +1;
            if(counter==list.size())
            {
            	if(test == null)
            	{
            		test = false;
            	}
            }
        }
        for (Boolean tf2 : list2) {
            if(tf2==true){truecounter2 = truecounter2+1;}
            counter2 = counter2 +1;
        	if(truecounter2==15)
        	{test2=list2.get(counter2);
	        	truecounter2 = 0;}
            if(counter2==list2.size())
            {
            	if(test2 == null)
            	{
            		test2 = false;
            	}
            }
        }
        assertEquals(true,test);//if fails, means true was never returned 40 times out of 200. Improbable but not unlikely.
        assertEquals(false,test2);
	}

}
