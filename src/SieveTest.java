

import javax.management.MXBean;

import org.junit.Assert;
import org.junit.Test;

public class SieveTest {
	 SieveOfEratosthenes classUnderTest = new SieveOfEratosthenes();
	
	@Test
	public void outputTest() {
		int maxValTest = 10;
		boolean[] test = new boolean[maxValTest + 1];
		
		classUnderTest.sieve(test, maxValTest);
		
		for (int i = 0; i < 11; i++) {
			System.out.println(test[i]);	
		}
		
		boolean[] expected = new boolean[maxValTest + 1];
		
		expected[0] = true;
		expected[1] = true;
		expected[2] = false;
		expected[3] = false;
		expected[4] = true;
		expected[5] = false;
		expected[6] = true;
		expected[7] = false;
		expected[8] = true;
		expected[9] = true;
		expected[10] = true;
		
		Assert.assertArrayEquals(expected, test);
	}
	
}
