import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testWordSearch {
WordSearch sut;
	@Before
	public void setUp() throws Exception {
		sut = new WordSearch;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConfirmation() {
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testAvailableCoachSeats(){
			int result = sut.getAvailableCoachSeats() - sut.getBookedCoachSeats();
			assertEquals(75, result);	
		}

}
