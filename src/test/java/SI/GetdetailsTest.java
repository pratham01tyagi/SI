package SI;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetdetailsTest {

	@Test
	public void testGetdetails() {
		Getdetails test = new Getdetails();
		int j = 0;
		if (test.getdetails() == 1 || test.getdetails() == 0) {
			j++;
		}
		assertEquals(1, j);

	}

}
